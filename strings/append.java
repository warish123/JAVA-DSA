public class append {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("abc");
        System.out.println(sb);
        sb.append("xyz");
        System.out.println(sb);
        char ch[] ={ 'a','b','m','t'};
        sb.append(ch);
        System.out.println(sb);

    }
}
