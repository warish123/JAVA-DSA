public class studentClass {
    public static class Node {
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }

        
    }
    public static int length(Node head){
       int count = 0;
       while(head != null){
        count++;
        head = head.next;
       }
       return count;
    }
    public static void displyrecursvly(Node head ){
        if(head==null) return;
        System.out.println(head.data);
        displyrecursvly(head.next);

    }
    // public static void display(Node a) {
    //     Node temp  = a;
    //     while(temp != null){
    //         System.out.println(temp.data);
    //         temp = temp.next;
    //     }
        
    // }
    
    public static void main(String[] args) {
        Node a = new Node(5);
        Node b = new Node(7);
        Node c = new Node(9);
        Node d = new Node(2);
        a.next = b;
        b.next = c;
        c.next = d;
        //display(a);
        displyrecursvly(a);
       System.out.println(length(a));
        
       
    
        
       
    }
}