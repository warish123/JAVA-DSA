import java.util.Scanner;

public class binary_string {
    public static void print_string(String s, int n) {
        int m = s.length();
        if(m==n){
            System.out.println(s);
            return;
        }
        if(m==0 || s.charAt(m-1)=='0'){
            print_string(s+1, n);
            print_string(s+0, n);
        }
        else{
            print_string(s+0, n);
        }
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n:");
        int n = sc.nextInt();
        print_string("", n);
    }
}
