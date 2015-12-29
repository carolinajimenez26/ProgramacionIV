
package visitante;

import java.util.LinkedList;
import java.util.Queue;

public class InOrder implements Visitor{
    
    private Queue<Node> st = new LinkedList<Node>();
    
    //@Override
    public void visit(Node n){
        /*if(n.getLeft() != null) n.getLeft().accept(this);
        st.enqueue(n);//mete el nodo a la cola
        if(n.getRight() != null) n.getRight().accept(this);*/
    }
    
}
