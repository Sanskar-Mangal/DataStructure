import java.util.Scanner;

public class Bubbleusingrecursion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the size of array");
        int size = input.nextInt();

        System.out.println("Enter the elements");
        int arr[] = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = input.nextInt();
        }

        System.out.println("Original Array");

        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }

        recursiveBubbleSort(arr, size, 0);

        System.out.println("\nSorted Elements are:");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }

        input.close();
    }

    // Recursive bubble sort
    static void recursiveBubbleSort(int arr[], int n, int i) {
        if (i == n - 1) {
            return;
        }

        for (int j = 0; j < n - i - 1; j++) {
            if (arr[j] > arr[j + 1]) {
                // Swapping elements
                int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
            }
        }

        // Recursive call for the next pass
        recursiveBubbleSort(arr, n, i + 1);
    }
}