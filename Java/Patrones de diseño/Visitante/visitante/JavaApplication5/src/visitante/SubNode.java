package javaapplication5;

import visitante.Node;

public class SubNode extends BinNode implements Node {

    public SubNode(Node left, Node right){
        super(left, right);
    }
    
    @Override
    public double calc() {
        return left.calc()-right.calc();
    }
    
    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }
}
