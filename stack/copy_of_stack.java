import java.util.Stack;
public class copy_of_stack {
    public static void main(String[] args) {
        Stack <Integer> st = new Stack<>();
        st.push(12);
        st.push(34);
        st.push(56);
        st.push(99);
        st.push(78);
        System.out.println("original Stack"+st);
        Stack <Integer> temp = new Stack<>();
        while(!st.isEmpty()){
            temp.push(st.pop());
        }
        System.out.println("temperary Stack"+temp);
        Stack <Integer> copyStack = new Stack<>();
        while(!temp.isEmpty()){
            copyStack.push(temp.pop());
        }
        System.out.println("copy of original stack"+copyStack);
    }
}
