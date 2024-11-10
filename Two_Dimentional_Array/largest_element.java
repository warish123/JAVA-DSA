import java.util.Scanner;

public class largest_element {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[][]= {{2,4,6},{5,9,3},{10,14,7}};
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                max=Math.max(max, arr[i][j]);
                
            }
            
        }
        System.out.println(max);
    }
}
