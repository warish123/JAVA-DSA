import java.util.Arrays;

public class copy_of_array {
    public static void main(String[] args) {
        int arr[] = {30,23,45,76,12,32};
        System.out.println("Before copy: ");
        for(int ele : arr){
            System.out.print(ele+" ");
        }
        System.out.println();
        int brr[] = Arrays.copyOf(arr, arr.length);
        System.out.println("Ater copy: ");
        for(int ele : brr){
            System.out.print(ele+" ");
        }
        System.out.println();
        System.out.println("Change in brr :");
        brr[0] = 85;
        for(int ele : brr){
            System.out.print(ele+" ");
        }
        System.out.println();
        Arrays.sort(brr);
        System.out.println("After sort: ");
        for(int ele : brr){
            System.out.print(ele+" ");
        }
    }
}
