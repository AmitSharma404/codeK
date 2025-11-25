package DAA;

public class BinarySearchTree {
    Node root;

    public void Insert(Node node){
        root = insertHelper(root, node);
    }
    private Node insertHelper(Node root,Node node){
        int data = node.data;
        if(root == null ) {
            root = node;
            
        } else if(data < root.data) {
            root.left = insertHelper(root.left, node);
        } else {
            root.right = insertHelper(root.right, node);
        }
        return root;
    }
    public void Display(){
         DiplayHelper(root);
    }
    private void DiplayHelper(Node root){
        if(root != null) {
            DiplayHelper(root.left);
            System.out.println(root.data);
            DiplayHelper(root.right);
            System.out.println(root.data);
        }
    }
    public boolean Search(int date){

    }
    private boolean SearchHelper(Node root,int data){

    }
    public void Remove(int data){

    }
    public Node RemoveHelper(Node root,int data){

        return null;
    }

    private int successor(Node root) {
        return 0;
    }
    private int predcessor(Node root) {
        return 0;
    }
}

