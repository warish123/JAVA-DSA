import java.util.Scanner;

public class sum_1_to_N {
    public static int printSum(int n){
        if(n==0 || n==1)return n;
        int sum = printSum(n-1);
        sum = sum + n;
        return sum;
        
    
    }
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter n");
    int n = sc.nextInt();
    System.out.println( printSum(n));

   }
}
