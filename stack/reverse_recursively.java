import java.util.Stack;
public class reverse_recursively {
    public static void display(Stack<Integer> st){
        if(st.isEmpty())return;
        int top = st.pop();
        System.out.println(top);
        display(st);
        st.push(top);
    }
    public static void main(String[] args) {
        Stack <Integer> st  = new Stack<>();
        st.push(12);
        st.push(34);
        st.push(56);
        st.push(99);
        st.push(78);
        System.out.println("original stack:"+st);
        display(st);
    }
}
