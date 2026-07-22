import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Step 1: Read size
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        // Step 2: Create array
        int[] arr = new int[n];

        // Step 3: Read elements
        System.out.println("Enter array elements:");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Step 4: Read index
        System.out.print("Enter index: ");
        int index = sc.nextInt();

        // Step 5: Print element
        if(index >= 0 && index < n) {
            System.out.println("Element at index " + index + " is " + arr[index]);
        } else {
            System.out.println("Invalid Index");
        }

        sc.close();
    }
}