class sll{
    Node head;
    Node tail;
    int size;
   void InsertAtEnd(int val){
    Node temp = new Node(val);
    if(head==null){
        head = temp;
        tail = temp;
    }else{
        tail.next = temp;
        tail  = temp;
    }
    size++;

   }
   void InsertAthead(int value){
    Node temp = new Node(value);
    if(head==null){
        head = temp;
        tail = temp;
    }else{
        temp.next = head;
        head = temp;

    }
    size++;
   }
   void insert(int idx, int value){
    if(idx==0){
        InsertAthead(value);
        return;
    }
    if(idx==size){
        InsertAtEnd(value);
        return;
    }
    if(idx>size){
        System.out.println("invalid index!!");
        return;
    }
    Node temp = new Node(value);
    Node x = head;
    for (int i = 0; i < idx-1; i++) {
        x = x.next;
        
    }
    temp.next = x.next;
    x.next = temp;
    size++;
   }
   int getElemet(int idx){
    if(idx==size) return tail.val;
    if(idx<0 || idx>size){
        System.out.println("invalid ");
        return-1;
    }
    Node temp= head;
    for (int i = 0; i <=idx; i++) {
        temp = temp.next;  
    }
    return temp.val;

   }
   void set(int idx, int value){
    if(idx<0 || idx>size){
      System.out.println("error");
    }
    Node temp = head;
    for (int i = 0; i <=idx; i++) {
        temp = temp.next;
        
    }
    temp.val = value;
   }
   void deleteAthead(){
    if(size==null){
        System.out.println("error");
    }
   }
   void display(){
    Node temp = head;
    while (temp!=null) {
        System.out.print(temp.val+" ");
        temp = temp.next ;
        
    }
    System.out.println();
   }
}
public class implement {
    public static void main(String[] args) {
        sll list = new sll();
        // System.out.println(list.size);
        list.InsertAtEnd(10);
        list.InsertAtEnd(20);
        // System.out.println(list.size);
        list.InsertAtEnd(44);
        list.display();
        list.InsertAthead(99);
        list.display();
        list.insert(2,102);
        list.display();
        list.insert(4,155);
        list.display();
        System.out.println(list.size);
        System.out.println(list.getElemet(3));
        list.set(2,39);
        list.display();
        list.deleteAthead();
      
        
        
    }
}
