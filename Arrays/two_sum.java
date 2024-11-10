public class two_sum {
    public static void main(String[] args) {
        int arr[] = {1,4,7,9,5,0,1,3};
        int x = 11;
        for(int i=0; i <arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i]+arr[j]==x){
                    System.out.println(arr[i]+" "+arr[j]);
                    break;
                }

            }
        }
    }
}
