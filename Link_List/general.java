class Node{
    int val;
    Node next;
    Node(int val){
        this.val = val;
    }
}

public class general {
    public static void print(Node temp){
        while(temp != null) {
            System.out.println(temp.val);
            temp = temp.next;
            
           }
    }
    public static void main(String[] args) {
       Node a = new Node(40);
       Node b = new Node(50);
       Node c = new Node(60);
       Node d = new Node(70);
       Node e = new Node(80);
       a.next = b;
       b.next = c;
       c.next = d;
       d.next = e;
      print(a);
      
    //    System.out.println(a.val);
    //    System.out.println(a.next.val);
    //    System.out.println(a.next.next.val);
    //    System.out.println(a.next.next.next.val);
    //    System.out.println(a.next.next.next.next.val);

        
    }
}
