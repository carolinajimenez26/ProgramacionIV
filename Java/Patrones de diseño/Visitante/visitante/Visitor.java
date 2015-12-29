/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author utp
 */
public interface Visitor {
    public void visit(Number node);
    public void visit(Variable node);
    public void visit(AddNode node);
    public void visit(SubNode node);
    public void visit(MulNode node);
    public void visit(DivNode node);
}
