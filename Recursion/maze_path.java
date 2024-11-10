import java.util.Scanner;

public class maze_path {
     public static int maze_path(int row, int column, int m, int n){
        if(row==m  || column==n)return 1;
        int right = maze_path(row, column+1, m, n);
        int down = maze_path(row+1, column, m, n);
        return right+down;
    }
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter n:");
    int n = sc.nextInt();
    System.out.println("Enter m:");
    int m = sc.nextInt();
    System.out.println(maze_path(1,1,m,n));
    }
}
