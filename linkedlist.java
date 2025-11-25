class linkedlist{
    class Node{
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
        }
    };

    // add first , add last
    Node head;
    public void addfirst(String data) {
        if(head == null ) {
            Node newNode = new Node(data);
            newNode = head;
            return;
        }
    }

    public void addlast(String data) {
        head = currNode;
    }

    
    public static void main(String[] args) {
        linkedlist list = new linkedlist();
    }
}