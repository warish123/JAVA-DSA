import java.util.Scanner;

public class second_largest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of the Array");
        int n = sc.nextInt();
        int arr[] = new int [n];
        System.out.println("Enter Element");
        for(int i =0; i<n;i++){
            arr[i] = sc.nextInt();
        }
        int max = Integer.MIN_VALUE;
        int smax = max;
        for(int i =0; i<n;i++){
            if(arr[i]>max){
                smax = max;
                max = arr[i];
            }
        }
        System.out.println(smax);

        
    }
}
