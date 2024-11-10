import java.util.Scanner;

public class update_even_posititon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String:");
        String s = sc.nextLine();
        int n = s.length();
        String str = "";
        for (int i = 0; i < n; i++) {
            if(i%2==0){
                str += 'a';
            }
            else{
                str += s.charAt(i);
            }
            
        }
        System.out.println(str);
    }
}
