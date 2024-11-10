public class Wave_form_Print {
    public static void print(int[][]arr){
        int m = arr.length, n = arr[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j]+" ");
                
            }
            System.out.println();
            
        }
    }
    public static void main(String[] args) {
        int arr[][] = {{1,2,3,11},{4,5,6,12},{7,8,9,13}};
        System.out.println("Before Wave form:");
        print(arr);
        int m = arr.length,n = arr[0].length;
        System.out.println("After Wave form:");
        for (int i = 0; i < m; i++) {
            if(i%2==0){
                for (int j = 0; j < n; j++) {
                    System.out.print(arr[i][j]+" "); 
                }
            }
            else{
                for (int j = n-1; j>=0; j--) {
                    System.out.print(arr[i][j]+" ");
                    
                }
            }
            
            
        }

    }
}
