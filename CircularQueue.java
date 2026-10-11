package datastructure;


import java.util.Scanner;

public class CircularQueue{

    int[] arr;
    int front;
    int rear;
    int size;
    int capacity;

    CircularQueue(int capacity) {
        this.capacity = capacity;
        arr = new int[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }

    // Enqueue
    void enqueue(int value) {

        if (size == capacity) {
            System.out.println("Queue is Full!");
        } else {
            rear = (rear + 1) % capacity;
            arr[rear] = value;
            size++;

            System.out.println(value + " inserted into queue.");
        }
    }

    // Dequeue
    void dequeue() {

        if (size == 0) {
            System.out.println("Queue is Empty!");
        } else {
            System.out.println(arr[front] + " deleted from queue.");

            front = (front + 1) % capacity;
            size--;
        }
    }

    // Display
    void display() {

        if (size == 0) {
            System.out.println("Queue is Empty!");
        } else {
            System.out.print("Queue: ");

            for (int i = 0; i < size; i++) {
                int index = (front + i) % capacity;
                System.out.print(arr[index] + " ");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter queue capacity: ");
        int capacity = sc.nextInt();

        CircularQueue q = new CircularQueue(capacity);

        int choice;

        do {
            System.out.println("\n1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. Display");
            System.out.println("4. Exit");

            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            if (choice == 1) {

                System.out.print("Enter value: ");
                int value = sc.nextInt();

                q.enqueue(value);

            } else if (choice == 2) {

                q.dequeue();

            } else if (choice == 3) {

                q.display();

            } else if (choice == 4) {

                System.out.println("Program Ended.");

            } else {

                System.out.println("Invalid choice!");
            }

        } while (choice != 4);

        sc.close();
    }
}
