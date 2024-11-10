import java.util.Stack;

public class print_stack {
    public static void main(String[] args) {
        Stack <Integer> st  = new Stack<>();
        st.push(12);
        st.push(34);
        st.push(56);
        st.push(99);
        st.push(78);
        System.out.println("1st way to print:"+st);

        System.out.println("2nd way to print:");
        while(!st.isEmpty()){
            System.out.print(st.pop()+" ");
        }

    }
}
