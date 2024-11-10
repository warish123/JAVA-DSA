import java.util.HashSet;

public class basicSet {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(12);
        set.add(43);
        set.add(54);
        set.add(66);
        set.add(78);
        set.add(499);
        System.out.println(set);
        set.remove(66);
        System.out.println(set+" "+set.size());
        set.remove(12);
        System.out.println(set+" "+set.size());
        System.out.println(set.contains(43));
        System.out.println(set.contains(12));
        Object[] arr = set.toArray();
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" "); 
        }
    }
}