package datastructure;
import java.util.Scanner;

public class queqe{

    // Node class
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static Node front = null;
    static Node rear = null;

    // Enqueue operation
    static void enqueue(int value) {
        Node newNode = new Node(value);

        if (rear == null) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }

        System.out.println(value + " inserted into queue.");
    }

    // Dequeue operation
    static void dequeue() {
        if (front == null) {
            System.out.println("Queue is Empty!");
            return;
        }

        int value = front.data;
        front = front.next;

        if (front == null) {
            rear = null;
        }

        System.out.println(value + " deleted from queue.");
    }

    // Peek operation
    static void peek() {
        if (front == null) {
            System.out.println("Queue is Empty!");
        } else {
            System.out.println("Front element: " + front.data);
        }
    }

    // Display operation
    static void display() {
        if (front == null) {
            System.out.println("Queue is Empty!");
            return;
        }

        Node temp = front;

        System.out.println("Queue elements:");

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }

        System.out.println();
    }

    // Main method
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int choice;

        do {
            System.out.println("\n--- Queue Using Linked List ---");
            System.out.println("1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. Peek");
            System.out.println("4. Display");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter value: ");
                    int value = sc.nextInt();
                    enqueue(value);
                    break;

                case 2:
                    dequeue();
                    break;

                case 3:
                    peek();
                    break;

                case 4:
                    display();
                    break;

                case 5:
                    System.out.println("Program ended.");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 5);

        sc.close();
    }
}

