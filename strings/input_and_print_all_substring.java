import java.util.Scanner;

public class input_and_print_all_substring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        for(int i =0; i<s.length();i++){
            for (int j = i+1; j <=5; j++) {
                System.out.print(s.substring(i, j)+" ");
                
            }
            System.out.println();
        }

    }
}
