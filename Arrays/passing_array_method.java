public class passing_array_method {
    public static void main(String[] args) {
        int arr[] = {10, 30, 40, 50};
        System.out.println(arr[0]);
        change(arr);
        System.out.println(arr[0]);

    }
    public static void change(int[] arr) {
        arr[0] = 200;
        
    }
}
