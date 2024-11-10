public class rotate_90s_degree_array {
    public static void print(int arr[][]){
        int m = arr.length, n = arr[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j]+" ");
                
            }
            System.out.println();
            
        }
    }
    public static void main(String[] args) {
        int arr[][] = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println("Before Rotate:");
        print(arr);
        int m = arr.length,n = arr[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < i; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp; 
            }
            System.out.println();
            
        }
        System.out.println("After Transpose:");
        print(arr);
        System.out.println();
        for (int i = 0; i < m; i++) {
            int a = 0, b= m-1;
           while (a<b) {
            int temp = arr[i][a];
            arr[i][a] = arr[i][b];
            arr[i][b] = temp;
            i++;
            b--;
            
           }
        }
        System.out.println("After Rotate:");
        print(arr);

    }
}
