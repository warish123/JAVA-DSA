import java.util.Scanner;

public class Star_Square {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the side of Square:");
        int n = sc.nextInt();
        for(int i =1; i<=n; i++){
            for(int j = 1; j<=n; j++){
                System.out.print("* ");
            }
            System.out.println();
           }

    }
}