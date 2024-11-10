import java.util.Scanner;

public class generate_paranthesis {
    public static void prin_paranthesis(int open, int close, int n, String s) {
        if (s.length() == 2 * n) {
            System.out.println(s);
            return;
        }
        if (open < n)
            prin_paranthesis(open + 1, close, n, s + "(");
        if (open > close)
            prin_paranthesis(open, close + 1, n, s + ")");

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n:");
        int n = sc.nextInt();
        prin_paranthesis(0, 0, n, "");
    }
}
