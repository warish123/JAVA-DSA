import java.util.Arrays;

public class buildinMethod {
    public static void main(String[] args) {
        int arr[] = {40,30,50,12,65,23};
        System.out.print("Before sort array: ");
        for(int ele : arr){
            System.out.print(ele+" ");
        }
        System.out.println();
        Arrays.sort(arr);
        System.out.print("After sort array: ");
        for(int ele : arr){
            System.out.print(ele + " ");
        }
    }
}
