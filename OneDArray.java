package datastructure;


import java.util.Scanner;

public class OneDArray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arr = new int[100];
        int size;

        System.out.print("Enter number of elements (1-100): ");
        size = sc.nextInt();

        if (size < 1 || size > 100) {
            System.out.println("Invalid size! Enter between 1 and 100.");
            sc.close();
            return;
        }

        System.out.println("Enter " + size + " elements:");

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("\nArray elements are:");

        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println("\n\nArray elements with index:");

        for (int i = 0; i < size; i++) {
            System.out.println("Index " + i + " = " + arr[i]);
        }

        sc.close();
    }
}
