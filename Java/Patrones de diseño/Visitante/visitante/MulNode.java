/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author utp
 */
public class MulNode extends BinNode implements Node {

    public MulNode(Node left, Node right) {
        super(left, right);
    }

    @Override
    public double calc() {
        return left.calc() * right.calc();
    }    

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }
    
}
