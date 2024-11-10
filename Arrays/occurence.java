import java.util.Scanner;
public class occurence{
   

    // Method to find the last occurrence of x in the array
    static int lastOccurrence(int[] arr, int x) {
        int lastIndex = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                lastIndex = i;
            }
        }
        return lastIndex;
    }

    // Method to count the occurrences of x in the array
    static int countOccurrence(int[] arr, int x) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input array size
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();

        // Input array elements
        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        // Input the value of x to search in the array
        System.out.println("Enter the value of X: ");
        int x = sc.nextInt();

        // Display the count of x and the last occurrence of x
        System.out.println("Count of " + x + ": " + countOccurrence(arr, x));
        System.out.println("Last occurrence of " + x + ": " + lastOccurrence(arr, x));
    }
}

