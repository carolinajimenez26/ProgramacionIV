package javaapplication5;

import java.util.Stack;
import javaapplication5.AddNode;
import javaapplication5.DivNode;
import javaapplication5.MulNode;
import javaapplication5.Number;
import javaapplication5.SubNode;
import javaapplication5.Variable;
import javaapplication5.Visitor;

public class CalcVisitor implements Visitor {
    
    private Stack<Double> st = new Stack<Double>();//pila que va a ir guardando los valores del árbol

    public double getValue() {//el resultado final, no lo sacamos de la pila, sólo lo mostramos
        return st.peek();
    }

    @Override
    public void visit(AddNode node) {
        node.getRight().accept(this);//visita el derecho
        node.getLeft().accept(this);//visita el izquierdo
        st.push(st.pop() + st.pop());//hace el cálculo y lo mete a la pila
    }

    @Override
    public void visit(SubNode node) {
        node.getRight().accept(this);//visita el derecho
        node.getLeft().accept(this);//visita el izquierdo
        st.push(st.pop() - st.pop());//hace el cálculo y lo mete a la pila
    }

    @Override
    public void visit(MulNode node) {
        node.getRight().accept(this);//visita el derecho
        node.getLeft().accept(this);//visita el izquierdo
        st.push(st.pop() * st.pop());//hace el cálculo y lo mete a la pila
    }

    @Override
    public void visit(DivNode node){
        node.getRight().accept(this);//visita el derecho
        node.getLeft().accept(this);//visita el izquierdo
        st.push(st.pop() / st.pop());//hace el cálculo y lo mete a la pila
    }

    @Override
    public void visit(Number node) {
        st.push(node.getValue());//no tiene que hacer operaciones, sólo lo pone
    }

    @Override
    public void visit(Variable node) {
        st.push(node.getValue());
    }
    
}
