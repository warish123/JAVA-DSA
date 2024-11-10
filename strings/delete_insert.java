public class delete_insert {
    public static void main(String[] args) {
        StringBuilder s = new StringBuilder("abcdef");
        System.out.println(s);
        s.deleteCharAt(3);
        System.out.println(s);
        s.delete(2, 5);
        System.out.println(s);
        s.insert(1, 'g');
        System.out.println(s);
    }
}
