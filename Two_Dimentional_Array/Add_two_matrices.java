public class Add_two_matrices {
    public static void main(String[] args) {
        int arr[][] = {{2,3,5},{6,8,5},{9,3,1}};
        int brr[][] = {{8,3,2},{4,6,9},{9,0,3}};
        int m = arr.length;
        int n = arr[0].length;
        int res[][] = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                res[i][j] = arr[i][j]+brr[i][j];
                
            }  
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
              System.out.print(res[i][j]+" ");
                
            }  
            System.out.println();
        }
        
    }
}
