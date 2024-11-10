public class loweUppercase {
    public static void main(String[] args) {
        String s = "Warish is 22 Years Old";
        //method-->1
        System.out.println(s.toLowerCase());

        //method-->2
        String a = s.toLowerCase();
        System.out.println(a);

        //method-->1
        System.out.println(s.toUpperCase());

        //method-->2
        String b = s.toUpperCase();
        System.out.println(b);

        //method-->1
        String c = "xyz";
        String d = "abc";
        System.out.println(c.concat(d));
        //method-->2
        c = c.concat(d);
        System.out.println(c);
    }
}
