public class print_all_arr_element {
    public static void print(int i,int []arr) {
        if(i==arr.length) return;
        System.out.println(arr[i]+" ");
        print(i+1,arr);

        
    }
    public static void main(String[] args) {
        int arr[] = {2,4,6,3,7,9};
        print(0,arr);
    }
}
