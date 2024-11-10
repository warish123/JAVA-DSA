import java.util.HashSet;

public class set_Iterate {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(23);
        set.add(45);
        set.add(67);
        set.add(89);
        set.add(90);
        for(int ele : set){
            System.out.print(ele+" ");
        }
        System.out.println();
        System.out.println(set);
    }
}
