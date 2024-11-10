import java.util.*;
public class reverse_K_times {
    public static void main(String[] args) {
        int k = 3;
        Queue <Integer> q = new LinkedList<>();
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);
        q.add(60);
        q.add(70);
        int n = q.size();
        System.out.println("Before reverse k step:"+q);
        Stack <Integer> st = new Stack<>();
        while(q.size()>=k);{
            st.push(q.remove());
        }
        while(q.size()>0);{
            q.add(st.pop());
        }
        while (q.size()>n-k) {
            st.push(q.remove());   
        }
        while (q.size()>0) {
           q.add(st.pop());   
        }
        System.out.println("After reversing k step:"+q);

    }
}
