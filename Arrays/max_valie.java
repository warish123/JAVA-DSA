import java.util.Scanner;

public class max_valie {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of the Array");
        int n = sc.nextInt();
        int arr[] = new int [n];
        System.out.println("Enter Element");
        for(int i =0; i<n;i++){
            arr[i] = sc.nextInt();
        }
        int max = arr[0];
        for(int i =1; i<n;i++){
            if(arr[i]>max){
                max = arr[i];
                break;
            }
        }
        System.out.println(max);

        
    }
}
