
import java.util.Stack;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author utp
 */
public class CalcVisitor implements Visitor {
    
    private Stack<Double> st = new Stack<Double>();

    public double getValue() {
        return st.peek();
    }
    
    @Override
    public void visit(Number node) {
        st.push(node.getValue());
    }

    @Override
    public void visit(Variable node) {
        st.push(node.getValue());
    }

    @Override
    public void visit(AddNode node) {
        node.getRight().accept(this);
        node.getLeft().accept(this);
        st.push(st.pop() + st.pop());
    }

    @Override
    public void visit(SubNode node) {
        node.getRight().accept(this);
        node.getLeft().accept(this);
        st.push(st.pop() - st.pop());
    }

    @Override
    public void visit(MulNode node) {
        node.getRight().accept(this);
        node.getLeft().accept(this);
        st.push(st.pop() * st.pop());
    }

    @Override
    public void visit(DivNode node) {
        node.getRight().accept(this);
        node.getLeft().accept(this);
        st.push(st.pop() / st.pop());
    }
    
}
