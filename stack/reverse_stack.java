import java.util.Stack;
public class reverse_stack {
    public static void main(String[] args) {
        Stack <Integer> st_original = new Stack<>();
        st_original.push(12);
        st_original.push(34);
        st_original.push(56);
        st_original.push(99);
        st_original.push(78);
        System.out.println("original stack: "+st_original);
        Stack <Integer> st_reverse = new Stack<>();
        while(!st_original.isEmpty()){
            st_reverse.push(st_original.pop());
        }
        System.out.println("reverse stack: "+st_reverse);
        
    }
}
