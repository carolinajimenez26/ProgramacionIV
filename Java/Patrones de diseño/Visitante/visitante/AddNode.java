/**
 *
 * @author utp
 */
public class AddNode extends BinNode implements Node {

    public AddNode(Node left, Node right) {
        super(left, right);
    }

    @Override
    public double calc() {
        return left.calc() + right.calc();
    }    

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }
}
