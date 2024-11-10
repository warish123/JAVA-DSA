public class equal {
    public static void main(String[] args) {
        String s = "abcxyz";
        String a = "abcxyz";
        String t = "abc";
        t = t + "xyz";
        String c = new String("abcxyz");
        System.out.println(s==t);
        System.out.println(a==s);
        System.out.println(t==c);
        System.out.println(s.equals(c));
        System.out.println(s.equals(t));
    }
}
