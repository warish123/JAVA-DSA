import java.util.Scanner;

public class Roll_num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size :");
        int n = sc.nextInt();
        int arr[] = new int [n];
        for(int i =0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        for(int i =0; i<n; i++){
            if(arr[i]<35){
                System.out.println(arr[i]);
            }
        }

    }
}
