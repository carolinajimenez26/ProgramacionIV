
package bst;

public class Node<Key, Value> {
    private Key key;
    private Value value;
    private Node left, right;
    
    public Node(Key key, Value value, Node left, Node right){
        this.value = value;
        this.key = key;
        this.left = left;
        this.right = right;
    }
    
    public Key getKey(){
        return key;
    }
    
    public Value getValue(){
        return value;
    }
    
    public String toString(){
        String key = (String)getKey();
        String value = (String)getValue();
        return "Key: "+key+" Value: "+value;
    }

    Object getLeft() {
        return left;
    }

    Object getRight() {
        return right;
    }

//    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }
}
