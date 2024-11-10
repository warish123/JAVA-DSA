import java.util.ArrayList;

public class arraylist {
    public static void main(String[] args) {
        ArrayList <Integer> arr = new ArrayList<>();
        arr.add(0, 19);
        arr.add(1,34);
        arr.add(2,56);
        arr.add(3,87);
        arr.add(4,98);
        arr.add(5,10);
        // System.out.println(arr);
        System.out.println();

        for(int i =0; i<arr.size();i++){
            System.out.print(arr.get(i)+" ");
        }
        System.out.println();
        arr.set(3, 66);
        arr.add(55);
        for(int i =0; i<arr.size();i++){
            System.out.print(arr.get(i)+" ");
        }


    }
}
