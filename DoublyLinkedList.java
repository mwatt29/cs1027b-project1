public class DoublyLinkedList {                
    private Node head;
    private Node tail;

                                                            // our method to add a new node with a given value to the end of the list
    public void add(int value) { 
        Node newNode = new Node(value);                     
        if (head == null) {                             // if the list is empty the new node becomes the head and the tail
            head = newNode;
            tail = newNode;
        } else {                                       // or the new node is linked as the next node of our currentl tail
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;                       // tail is now the new node
        }
    }

                                                            // our method to remove the first node with a given value from the list
    public boolean remove(int value) {
        Node current = head;
        while (current != null) {
            if (current.value == value) {
                if (current.prev != null) {                // searches for the node with the given value, updates the links of neighboring nodes to bypass the node being removed, and adjusts the head or tail if necessary.
                    current.prev.next = current.next;
                } else {
                    head = current.next;
                }
                if (current.next != null) {
                    current.next.prev = current.prev;
                } else {
                    tail = current.prev;
                }
                return true;
            }
            current = current.next;
        }
        return false;
    }

                                                            // our method to reverse the order of the nodes in the list
    public void reverse() {
        Node current = head;
        Node temp = null;
        while (current != null) {                         // goes through the list, swappiing the next and previous pointers of each node 
            temp = current.prev;
            current.prev = current.next;
            current.next = temp;
            current = current.prev;
        }
        if (temp != null) {
            head = temp.prev;               // update the head to the new first node
        }
    }

                                                            // our meethod to print the values of all nodes from head to tail
    public void print() {
        Node current = head;
        while (current != null) {
            System.out.print(current.value + " ");  // prints through the list, followed by a space between each node
            current = current.next;
        }
        System.out.println();
    }

                                                            // our method to delete the entire list
    public void deleteList() {
        head = null;                         // sets both head and tail pointers to null, removing all references to the nodes
        tail = null;
    }

    // Helper method to print to a StringBuilder (for testing purposes)
    public void printToString(StringBuilder sb) {
        Node current = head;
        while (current != null) {
            sb.append(current.value).append(" ");
            current = current.next;
        }
    }
}
