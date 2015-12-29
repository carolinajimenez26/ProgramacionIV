
package javaapplication5;


public interface Visitor {
    public void visit(AddNode n);
    public void visit(SubNode n);
    public void visit(MulNode n);
    public void visit(DivNode n);
    public void visit(Number n);
    public void visit(Variable n);
}
