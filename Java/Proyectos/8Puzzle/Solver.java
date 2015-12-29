
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Usuario UTP
 */
public class Solver {

    private MinPQ<Node> pq;
    private Node goal;
   
    private class Node {
        private Board board;
        private int moves;
        private Node prev;
        
        public Node(Board board) {
            this(board, 0, null);
        }

        public Node(Board board, int moves, Node prev) {
            this.board = board;
            this.moves = moves;
            this.prev  = prev;
        }
        
        public int priority() {
            return board.manhattan() + moves;
        }
        
        @Override
        public String toString() {
            String out = "priority = " + priority();
            out += "\nmoves = " + moves;
            out += "\nmanhattan = " + board.manhattan();
            out += "\n" + board;
            return out;
        }
    }
    
    public Solver(Board board) {
        pq = new MinPQ<Node>(new Comparator<Node>() {
            @Override
            public int compare(Node n1, Node n2) {
                if (n1.priority() > n2.priority()) return 1;
                if (n1.priority() < n2.priority()) return -1;
                return n1.board.manhattan() - n2.board.manhattan();
            }          
        });
        pq.insert(new Node(board));
        
        while (true) {
            Node node = pq.delMin();
            
            if (node.board.isGoal()) {
                goal = node;
                break;
            }
            
            for (Board neighbor : node.board.neighborns()) {
                Node n = new Node(neighbor, node.moves + 1, node);
                if (node.prev != null) {
                    if (!neighbor.equals(node.board)) {
                        pq.insert(n);
                    }
                } else {
                    pq.insert(n);
                }
            }
        }
    }
    
    public int moves() {
        return goal != null ? goal.moves : -1;
    }
    
    public Iterable<Board> soluction() {
        List<Board> sol = new LinkedList<Board>();
        Node node = goal;
        while (node != null) {
            sol.add(node.board);
            node = node.prev;
        }
        Collections.reverse(sol);
        return sol;
    }
    
    public static void main(String[] args) {
        
        int[][] blocks = {{8,1,3},{4,0,2},{7,6,5}};
        Board initial = new Board(blocks);
        
        if (initial.isSolvable()) {
            Solver solver = new Solver(initial);
            System.out.println("Minimum number of moves = " + solver.moves());
            
            for (Board b : solver.soluction()) {
                System.out.println(b);
            }
        }
    }
}
