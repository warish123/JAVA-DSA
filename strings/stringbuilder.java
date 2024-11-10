public class stringbuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("10");
        System.out.println(sb.length());
        System.out.println(sb.capacity());
        System.out.println(sb);

        StringBuilder a = new StringBuilder();
        System.out.println(a);
        System.out.println(a.capacity());
        System.out.println(a.length());
    }
}
