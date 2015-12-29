
package javaapplication5;

import visitante.Node;

public class DivNode extends BinNode implements Node{
    
    public DivNode(Node left, Node right) {
        super(left, right);
    }

    public double calc() {
        return left.calc()/right.calc();
    }

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }
}
