import java.util.*;
public class dqueueK {
    public static void main(String[] args) {
        Deque<Integer> dq = new LinkedList();
        dq.addFirst(5);
        dq.addFirst(7);
        dq.addFirst(9);
        dq.addFirst(11);
        System.out.println(dq);
        dq.addLast(33);
        dq.addLast(77);
        System.out.println(dq);
        System.out.println(dq.getFirst());
        System.out.println( dq.getLast());
        dq.add(89);
        dq.remove();
        System.out.println(dq);
        
       
        
        

    }
}
