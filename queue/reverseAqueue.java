import java.util.*;
public class reverseAqueue {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(11);
        q.add(22);
        q.add(33);
        q.add(44);
        q.add(55);
        q.add(66);
        System.out.println("before reverse"+q);
        Stack<Integer> s = new Stack<>();
        while(q.size()>0){
            s.push(q.remove());
        }
        while(s.size()>0){
            q.add(s.pop());
        }
        System.out.println("after reverse"+q);
    }
}
