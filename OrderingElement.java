public class OrderingElement {
    static void Elementsorder(int arr[],int n){
        // create an empty array
        int temp[]=new int[n];
        // Traverse array
        int j=0;  //idx temp
        for (int i=0;i<n;i++)
            if(arr[i]>=0)
                temp[j++]=arr[i];
                // if array contains all positive for all
                if (j==n || j==0)
                    return;


                for (int i=0;i<n;i++)
                    if (arr[i]<0)
                        temp[j++]=arr[i];

                    for (int i=0;i<n;i++)
                        arr[i]=temp[i];

    }
    public static void main(String[] args){
        int arr[]={1, -1, 3, 2, -7, -5, 11, 6 };
        int n=arr.length;
        Elementsorder(arr,n);
        for (int i=0;i<n;i++)
            System.out.println(arr[i] + "");

    }
}
