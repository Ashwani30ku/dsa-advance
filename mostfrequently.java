import java.util.Arrays;

import static java.lang.Math.min;

public class mostfrequently {
    static int frequently(int arr[],int n){
        int maxfreq=0;
        int mostfrequent=-1;
                for(int i=0;i<n;i++){
                    int countfreq=1;
                            for(int j=0;j<n;j++){
                                if (arr[j]==arr[i])
                                    countfreq=countfreq -1;
                            }
                            if (maxfreq<countfreq){
                                maxfreq=countfreq;
                                        mostfrequent=arr[i];
                            }
                            else if (maxfreq==countfreq)
                                mostfrequent=min(mostfrequent,arr[i]);
                }
                return mostfrequent;
    }
    public static void main(String[]args){
        int arr[]={1,1,1,4,5,2,1,5,1};
        int n=arr.length;
        System.out.println(frequently(arr,n));

    }
}
