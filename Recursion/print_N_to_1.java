import java.util.Scanner;

public class print_N_to_1 {
    
        public static void printNtoOne(int n){
            if(n==0)return;
            System.out.println(n);
            printNtoOne(n-1);
        
            
        }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in );
        System.out.print("Enter n"+" ");
        int n = sc.nextInt();
        printNtoOne(n);
        
    }
}
