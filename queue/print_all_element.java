import java.util.LinkedList;
import java.util.Queue;

public class print_all_element {
    
    public static void main(String[] args) {
        Queue <Integer> q = new LinkedList();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        Queue <Integer> ans= new LinkedList();
        while (q.size() > 0) {
            System.out.println(q.peek());
            ans.add(q.poll()); 
        }
        while (ans.size() > 0) {
            q.add(ans.poll());   
        }
    }
}
