import java.util.Scanner;

public class Linear_search {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Target:");
        int x = sc.nextInt();
        System.out.println("Enter size of the Array:");
        int n = sc.nextInt();
        int arr[] = new int [n];
        System.out.println("Enter Element:");
        for(int i =0; i<n;i++){
            arr[i]=sc.nextInt();
        }
        // for(int i =0; i<n;i++){
        //     if(arr[i]==x){
        //         System.out.println("Element found.");
        //     }else{
        //         System.out.println("Element not found.");
        //     }
        // }

        boolean flag = false;
        for(int i =0; i<n;i++){
            if(arr[i]==x){
                flag = true;
            }
        }
        if(flag==true){
            System.out.println("Element found.");

        }else{
            System.out.println("Element not found.");
        }
    }
}
