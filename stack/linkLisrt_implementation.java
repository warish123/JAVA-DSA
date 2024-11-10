
public class linkLisrt_implementation {
    public static class Node{
        int val;
        Node next;
        Node(){
            this.val = val;
            this.next = null;
        }

    }
    public static class Stack {
        Node head = null;
        int size = 0;
        void push(){
            Node temp = new Node();
            temp.next = head;
            head = temp;
            size++;
        }
        int size(){
            return size;
        }
        int pop(){
            if(head==null){
                System.out.println("stack is empty");
                return -1;
            }
            int x = head.val;
            head = head.next;
            size--;
            return x;
        }
        int peek(){
            if(head==null){
                System.out.println("Stack is Empty");
                return -1;
            }
            int x = head.val;
            return x;
        }
    
        
    }
    public static void main(String[] args) {
        Stack st = new Stack();
        st.push(1);
        
    }
}
