# cs1027b-project1
# What This Project Does
This project implements a Doubly Linked List in Java. A doubly linked list is a linear data structure where each node contains pointers to both its previous and next nodes, allowing bidirectional traversal. It includes several key features to manage and manipulate the list effectively.
# Features of the Project
Node Structure:

Each node stores:
An integer value (value).
A pointer to the next node (next).
A pointer to the previous node (prev).
Operations Provided:

Add: Adds a new node with a specified value at the end of the list.
Remove: Removes the first node with a given value, updating neighboring nodes to maintain the list structure.
Reverse: Reverses the order of nodes in the list by swapping the next and prev pointers.
Print: Prints the values of all nodes from the head to the tail.
Delete List: Deletes the entire list by setting the head and tail pointers to null.
Testing Utility:

Includes a helper method to print the list into a StringBuilder for testing purposes.
How to Run It
Environment Setup:

Install Java Development Kit (JDK) if not already installed.
Use any IDE (e.g., IntelliJ IDEA, Eclipse) or a text editor and compile the program via the command line.
Running the Code:

Compile the files using:
bash
Copy code
javac Node.java DoublyLinkedList.java
Create a main method in another file (e.g., Main.java) to test the functionality:
java
Copy code
public class Main {
    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();
        
        list.add(10);
        list.add(20);
        list.add(30);
        list.print(); // Output: 10 20 30 

        list.remove(20);
        list.print(); // Output: 10 30

        list.reverse();
        list.print(); // Output: 30 10

        list.deleteList();
        list.print(); // Output: (empty line)
    }
}
Compile and run:
bash
Copy code
javac Main.java
java Main
Technologies/Libraries Used
Language: Java
Core Libraries:
Java's core utilities (no external dependencies).
This project demonstrates fundamental data structure operations and is suitable for showcasing skills in:

Object-oriented programming (OOP).
Data structure implementation.
Algorithmic problem-solving.
