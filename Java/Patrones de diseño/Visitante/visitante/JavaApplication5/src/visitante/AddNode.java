package visitante;

import visitante.Node;

public class AddNode extends BinNode implements Node{

    public AddNode(Node left, Node right) {//añade un nodo suma que tiene hijo izquierdo y derecho
        super(left, right);
    }

    @Override
    public double calc() {
        return left.calc()+right.calc();
    }
    
    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }

}
