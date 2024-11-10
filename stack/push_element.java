import java.util.Stack;
public class push_element {
    public static void main(String[] args) {
        // insert a element at bottom
        Stack <Integer> st  = new Stack<>();
        st.push(12);
        st.push(34);
        st.push(56);
        st.push(99);
        st.push(78);
        System.out.println("original stack:"+st);
        Stack <Integer> temp  = new Stack<>();
        while(st.size()>0){
            temp.push(st.pop());
        }
        int new_element = 50;
        st.push(new_element);
        System.out.println("push new  element in the stack"+st);
        while(temp.size()>0){
            st.push(temp.pop());
        }
        System.out.println("after push new element in the bottom of stack"+st);
    }
}
