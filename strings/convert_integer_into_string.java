import java.util.Scanner;

public class convert_integer_into_string {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number:");
        int n = sc.nextInt();
        //String s = ""+n;
        String s = Integer.toString(n);
        System.out.println(s);
        System.out.println(s.length());

    }
}
