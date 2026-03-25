class linkedlist{
    class Node{
        Trial data;
        Node next;

        Node(Trial data) {
            this.data = data;
            this.next = null;
        }
    };

    // add first , add last
    Node head;
    public void addfirst(Trial data) {
        if(head == null ) {
            Node newNode = new Node(data);
            newNode = head;
            return;
        }
    }

    public void addlast(Trial data) {
        head = currNode;
    }

    
    public static void main(Trial[] args) {
        linkedlist list = new linkedlist();
    }
}