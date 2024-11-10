public class print_string_element {
    public static void print(int i, String s) {
        if(i==s.length())return;
        System.out.println(s.charAt(i)+" ");
        print(i+1, s);
        
    }
    public static void main(String[] args) {
        String s = "jis college";
        print(0, s);
    }
}
