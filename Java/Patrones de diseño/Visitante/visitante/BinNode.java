/**
 *
 * @author utp
 */
public abstract class BinNode {
    
    protected Node left;
    protected Node right;
    
    public BinNode(Node left, Node right) {
        this.left  = left;
        this.right = right;
    }

    public Node getLeft() {
        return left;
    }

    public Node getRight() {
        return right;
    }

}
