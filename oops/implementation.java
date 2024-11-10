
public class implementation {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;

        }
    }
    public static class linkedlist {
        Node head = null;
        Node tail = null;
        void insertAtEnd(int val){
            Node temp = new Node(val);
            if(head==null) head = tail = temp;
            else{
                tail.next = temp;
                tail = temp;  
            } 
           
        }
        void insertAtfirst(int val){
            Node temp = new Node(val);
            if(head==null) head = tail = temp;
            else{
                temp.next = head;
                head = temp;
            }
        }
        void inserAt(int idx, int val){
            Node t = new Node(val);
            Node temp = head;
            for (int i = 1; i <idx-1; i++) {
                temp = temp.next; 
            }
            t.next = temp.next;
            temp.next = t;
        }
        int getAt(int idx){
            Node temp = head;
            for (int i = 0; i < idx; i++) {
                temp =temp.next ;
                
            }
            return temp.data;
        }
        void display(){
            Node temp = head;
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp = temp.next;
            }
            System.out.println();
        }
        int size(){
            int count = 0;
            Node temp = head;
            while(temp!=null){
                count++;
                temp = temp.next;
            }
            return count;

        }
    
        
    }
    public static void main(String[] args) {
        linkedlist list = new linkedlist();
        list.insertAtEnd(10);
        list.display();
        list.insertAtEnd(34);
        list.display();
        list.insertAtEnd(55);
        list.display();
        list.insertAtfirst(87);
        list.display();
        list.inserAt(3,99);
        list.display();
        System.out.println(list.getAt(2));

    }
}
