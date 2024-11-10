public class sum_of_all_element {
    public static void main(String[] args) {
        int arr[][]= {{2,4,6},{5,9,3},{10,14,7}};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
              sum += arr[i][j];
                
            }
            
        }
        System.out.println(sum);
    }
}
