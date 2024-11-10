import java.util.Stack;
public class basicstack {
    public static void main(String[] args) {
        Stack <Integer> st  = new Stack<>();
        System.out.println(st.isEmpty());
        st.push(12);
        st.push(34);
        st.push(56);
        st.push(99);
        st.push(78);
        System.out.println(st.isEmpty());
        System.out.println(st);
        // System.out.println(st.peek());
        // System.out.println(st.pop());
        // System.out.println(st);
        // System.out.println(st.pop());
        // System.out.println(st);
        // System.out.println(st.pop());
        // System.out.println(st);
        System.out.println(st.size());

        // to access the first element
        while(st.size()>1){
            st.pop();
        }
        System.out.println(st.isEmpty());
        System.out.println(st.pop());
        System.out.println(st.isEmpty());


    }
}
