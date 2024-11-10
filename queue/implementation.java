import java.util.LinkedList;
import java.util.Queue;

public class implementation {
    public static class queueA{
        int f = -1;
        int r = -1;
        int size = 0;
        int arr[] = new int[100];
        public void add(int val){
            if(r == arr.length-1){
                System.out.println("queue is full");
                return;
            }
            if(f == -1){
                f = r = 0;
                arr[0] = val;
            }
            else{
                arr[r+1] = val;
                r++;
            }
            size++;
        }
        public int remove(){
            if(size == 0){
                System.out.println("queue is empty");
                return-1;
            }
            f++;
            size--;
            return arr[f-1];

        }
        public int peek(){
            if(size == 0){
                System.out.println("queue is empty");
                return-1;
            }
            return arr[f];
        }
        public boolean isEmpty(){
            if(size==0){
               return true;
            }else{
                return false;
            }
        }
        public void display(){
            if(size == 0){
                System.out.println("queue is empty");
            }else{
                for (int i = f; i <= r; i++) {
                    System.out.println(arr[i]);  
                }
            }
           
        }
    
        
    }
    public static void main(String[] args) {
       queueA q = new queueA();
       q.display();
       q.add(1);
       q.add(2);
       q.display();
       q.remove();
       q.display();
       System.out.println(q.peek());

        
    }
}
