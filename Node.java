public class Node {
    public int value;            // represents a single node in our doubly linked list, has value stored in node
    public Node next;              // has pointers to the next and previous node in the list
    public Node prev;

    public Node(int value) {       //constructor to create a new node with a specified value
        this.value = value;        // will intialize the next and prevous pointers to null
        this.next = null;
        this.prev = null;
    }
}
