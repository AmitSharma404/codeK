package DAA;

public class Main {
    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();
        tree.Insert(new Node(5));
        tree.Insert(new Node(6));
        tree.Insert(new Node(7));
        tree.Insert(new Node(1));
        tree.Insert(new Node(2));
        tree.Insert(new Node(9));
        tree.Insert(new Node(3));
        tree.Insert(new Node(4));
        tree.Insert(new Node(8));

        tree.Display();
    }
}
