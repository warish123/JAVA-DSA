public class Transpose {
    public static void main(String[] args) {
        int arr[][]= {{2,4,6},{5,9,3}};
        int m = arr.length;
        int n = arr[0].length;
        int Trans[][]= new int[n][m];
        for (int j = 0; j < n; j++) {
            for (int i = 0; i < m; i++) {
              System.out.print(arr[i][j]+" ");
                
            }
            System.out.println();
            
        }
     
        for (int j = 0; j < n; j++) {
            for (int i = 0; i < m; i++) {
             Trans[j][i] = arr[i][j];
                
            }
            System.out.println();
            
        }
        System.out.println("After transpose store in new array:");
        for (int i = 0; i < Trans.length; i++) {
            for (int j = 0; j < Trans[0].length; j++) {
                System.out.print(Trans[i][j]+" ");
                
            }
            System.out.println();
            
        }
    }
}
