package datastructure;


import java.util.Scanner;

public class stack {

    // Node class
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static Node top = null;

    // Push
    static void push(int value) {
        Node newNode = new Node(value);

        newNode.next = top;
        top = newNode;

        System.out.println(value + " pushed into stack.");
    }

    // Pop
    static void pop() {
        if (top == null) {
            System.out.println("Stack is Empty!");
            return;
        }

        System.out.println(top.data + " popped from stack.");
        top = top.next;
    }

    // Peek
    static void peek() {
        if (top == null) {
            System.out.println("Stack is Empty!");
        } else {
            System.out.println("Top element is: " + top.data);
        }
    }

    // Display
    static void display() {
        if (top == null) {
            System.out.println("Stack is Empty!");
            return;
        }

        Node temp = top;

        System.out.println("Stack elements:");

        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    // Main method
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int choice;

        do {
            System.out.println("\n--- Stack Using Linked List ---");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peek");
            System.out.println("4. Display");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter value: ");
                    int value = sc.nextInt();
                    push(value);
                    break;

                case 2:
                    pop();
                    break;

                case 3:
                    peek();
                    break;

                case 4:
                    display();
                    break;

                case 5:
                    System.out.println("Program Ended.");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 5);

        sc.close();
    }
}
