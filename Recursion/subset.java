public class subset {
    public static void subset_print(int i, String s ,String ans){
        if(i==s.length()){
            System.out.println(ans);
            return;
        }
        char ch = s.charAt(i);
        subset_print(i+1, s, ans+ch);
        subset_print(i+1, s, ans);
    }
    public static void main(String[] args) {
        String s = "abcd";
        subset_print(0, s, "");

    }
}
