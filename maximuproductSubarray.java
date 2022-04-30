public class maximuproductSubarray {
    static int maxsubarray(int arr[]){
        int result=arr[0];
        int n=arr.length;
        for (int i=0;i<n;i++){
            int multiply=arr[i];
            for (int j=i+1;j<n;j++){
                result=Math.max(result,multiply);
                multiply=arr[j];
            }
            // updating the result for n-1 index
            result=Math.max(result,multiply);
        }
        return result;
    }
    public static void main(String[] args) {
        int arr[]={-1, -3, -10, 0, 60};
        System.out.println("maxm subarry product" + maxsubarray(arr));

    }
}
