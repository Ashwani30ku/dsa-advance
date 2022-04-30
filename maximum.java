public class maximum {
    static int arr[]={22,54,78,6,98,47};
    // method to find maximum in arr
    static int largest(){
        int i;
        // initialize maximum element
        int max=arr[0];
        // Traverse array element from second
        // compare every element with current max
        for (i=1;i<arr.length;i++)
            if (arr[i]>max)
                max=arr[i];
        return max;
    }

    public static void main(String[] args) {
        System.out.println("Find maximum " );
    }
}
