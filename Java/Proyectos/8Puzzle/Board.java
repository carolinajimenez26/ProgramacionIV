
import java.util.ArrayList;
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
public class Board {
    
    private int N;
    private int[][] blocks;
    private boolean solvable;
    
    public Board(int[][] blocks) {
        N = blocks.length;
        this.blocks = new int[N][N];
        int[] b = new int[N*N];
        int k = 0, sum = 0;
        
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                this.blocks[i][j] = blocks[i][j];
                b[k++] = blocks[i][j];
            }
        }
        
        // is Solvable?
        for (int i = 0; i < N*N - 1; i++) {
            if (b[i] == 0) continue;
            for (int j = i + 1; j < N*N; j++) {
                if (b[j] == 0) continue;
                if (b[i] > b[j]) sum++;
            }
        }
        solvable = sum % 2 == 0;
    }
    
    public int size() {
        return N;
    }
    
    public int hamming() {
        int hamming = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (blocks[i][j] == 0) continue;
                if (blocks[i][j] != i * N + j + 1) hamming++;
            }
        }
        return hamming;
    }
    
    public int manhattan() {
        int manhattan = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (blocks[i][j] == 0) continue;
                int row = (blocks[i][j] - 1) / N;
                int col = (blocks[i][j] - 1) % N;
                manhattan += Math.abs(row - i) + Math.abs(col - j);
            }
        }       
        return manhattan;
    }
    
    public boolean isGoal() {
        return manhattan() == 0;
    }
    
    public boolean isSolvable() {
        return solvable;
    }
    
    public Iterable<Board> neighborns() {
        // where is blank
        int row = -1, col = -1;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (blocks[i][j] == 0) {
                    row = i;
                    col = j;
                }
            }
        }
        
        List<Board> neighborns = new ArrayList<Board>();
        if (isValid(row-1, col)) {
            Board b = new Board(blocks);
            b.exch(row-1,col,row,col);
            neighborns.add(b);
        }
        if (isValid(row, col+1)) {
            Board b = new Board(blocks);
            b.exch(row,col+1,row,col);
            neighborns.add(b);
        }
        if (isValid(row+1, col)) {
            Board b = new Board(blocks);
            b.exch(row+1,col,row,col);
            neighborns.add(b);
        }
        if (isValid(row, col-1)) {
            Board b = new Board(blocks);
            b.exch(row,col-1,row,col);
            neighborns.add(b);
        }
        return neighborns;
    }
    
    public Board twin() {
        int row = 0;
        if (blocks[row][0] == 0 || blocks[row][1] == 0) {
            row++;
        }
        Board twin = new Board(blocks);
        twin.exch(row, 0, row, 1);
        return twin;
    }
    
    private boolean isValid(int row, int col) {
        if (row < 0 || row > N - 1) return false;
        if (col < 0 || col > N - 1) return false;
        return true;
    }
    
    private void exch(int frow, int fcol, int trow, int tcol) {
        int tmp = blocks[frow][fcol];
        blocks[frow][fcol] = blocks[trow][tcol];
        blocks[trow][tcol] = tmp;
    }
    
    @Override
    public boolean equals(Object o) {
        if (o == this) return true;
        if (o == null) return false;
        if (o.getClass() != this.getClass()) return false;
        Board b = (Board) o;
        if (N != b.size()) return false;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (blocks[i][j] != b.blocks[i][j]) return false;
            }
        }
        return true;
    }
    
    @Override
    public String toString() {
        String out = String.format("%2d\n", N);
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                out += (blocks[i][j] != 0) ? String.format(" %2d", blocks[i][j]) : "   ";
            }
            out += "\n";
        }
        return out;
    }
    
    public static void main(String[] args) {
        int[][] x = {{8,1,3},{4,0,2},{7,6,5}};
        Board b = new Board(x);
        
        System.out.println(b);
        System.out.printf("Hamming = %d\n", b.hamming());
        System.out.printf("Manhattan= %d\n", b.manhattan());
        System.out.printf("Solvable = %s\n\n", b.isSolvable());
        
        System.out.println("Neighborns");
        for (Board n : b.neighborns()) {
            System.out.println(n);
        }
        
        System.out.println("Twin Board");
        System.out.println(b.twin());
    }
}
