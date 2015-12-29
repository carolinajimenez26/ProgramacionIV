package bst;

public class BST<Key, Value> {
    
    public static void main(String[] args) {
        private Node root;
        InOrder inorder = new InOrder();
    
        root = new Node("CINCO",5,
                Node("CUATRO",4,null,null),Node("SEIS",6,null,null)
        );
        root.accept(inorder);
    }
    
}
