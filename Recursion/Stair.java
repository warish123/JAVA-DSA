import java.util.Scanner;

public class Stair {
    public static int stair(int n){
        if(n<=2)return n;
        return stair(n-1)+stair(n-2);
    }
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter n");
    int n = sc.nextInt();
    System.out.println(stair(n));
    }
}
