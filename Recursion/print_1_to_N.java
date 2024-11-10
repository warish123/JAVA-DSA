import java.util.Scanner;

public class print_1_to_N {
    public static void print_1_to_N(int n){
        if(n==0)return;
        print_1_to_N(n-1);
        System.out.println(n);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in );
        System.out.print("Enter n"+" ");
        int n = sc.nextInt();
        print_1_to_N(n);
        
    }
     
}
