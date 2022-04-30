// pair in sum

//Initial Template for Java
// Java implementation of
// simple method to find
// print pairs with given sum.

//class Arrays {
//
//    // Returns number of pairs
//    // in arr[0..n-1] with sum
//    // equal to 'sum'
//    static void printPairs(int arr[],
//                           int n, int sum)
//    {
//        // int count = 0;
//
//        // Consider all possible pairs
//        // and check their sums
//        for (int i = 0; i < n; i++)
//            for (int j = i + 1; j < n; j++)
//                if (arr[i] + arr[j] == sum)
//                    System.out.println("(" + arr[i] + ", " + arr[j] + ")");
//    }
//
//    // Driver Code
//    public static void main(String[] arg)
//    {
//        int arr[] = { 11, 10, 4, 5, 12, 3, 2 };
//        int n = arr.length;
//        int sum = 15;
//        printPairs(arr, n, sum);
//    }
//}











//import java.io.*; // for handling input/output
//import java.util.*; // contains Collections framework

 //don't change the name of this class
 //you can add inner classes if needed
//class Arrays {
//    public static void main (String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int arr[] = new int[n];
//        for (int i =0; i<n; i++){
//            arr[i] = sc.nextInt();
//        }
//        Arrays.sort(arr);
//        long ans = Integer.MIN_VALUE;
//        for (int i  =0; i<n; i++){
//            ans = Math.max(ans,arr[i]+arr[n-1-i]);
//        }
//        System.out.println(ans);
//    }
//     private static void sort(int[] arr) {
//    }
//}

// The time complexity of the above soulution is O(n^2) and doesn't requiere any extra space where n, is the size of the input.


// sort in Array;
//public class Arrays
//{
//    public static void main(String[] args)
//    {
////creating an instance of an array
//        int[] arr = new int[] {78, 34, 1, 3, 90, 34, -1, -4, 6, 55, 20, -65};
//        System.out.println("Array elements after sorting:");
////sorting logic
//        for (int i = 0; i < arr.length; i++)
//        {
//            for (int j = i + 1; j < arr.length; j++)
//            {
//                int tmp = 0;
//                if (arr[i] > arr[j])
//                {
//                    tmp = arr[i];
//                    arr[i] = arr[j];
//                    arr[j] = tmp;
//                }
//            }
////prints the sorted element of the array
//            System.out.println(arr[i]);
//        }
//    }
//}


// Java program to find
// the missing Number
// Java program to find missing Number


//import java.io.*; // for handling input/output
//import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
//class Main {
//    public static int binarySearch(int[] arr, int k) {
//        int l = 0;
//        int r = arr.length - 1;
//        while (l <= r) {
//            int mid = (l + r) / 2;
//            if (arr[mid] == k) return arr[mid];
//            else if (arr[mid] < k) l = mid + 1;
//            else r = mid - 1;
//        }
//        return -1;
//
//    }
//    public static void main (String[] args) {
//        // Your code here
//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//        int[] arr=new int[n];
//        for(int i=0;i<n;i++){
//            arr[i]=sc.nextInt();
//        }
//        Arrays.sort(arr);
//        int r;
//        for(int i=1;i<=arr.length;i++){
//            r=binarySearch(arr,i);
//            if(r==-1 && i!=r) System.out.print(i+" ");
//        }
//    }
//}



// Disappearing array find

import java.io.*; // for handling input/output
//import java.util.*; // contains Collections framework
//
// //don't change the name of this class
// //you can add inner classes if needed
//class Arrays {
//    public static void main (String[] args) {
//        // Your code her
//        Scanner sc=new Scanner(System.in);
//
//        int t = sc.nextInt();
//        for(int i = 0; i< t; i++){
//            int n = sc.nextInt();
//            int[] arr = new int[n];
//            for (int j = 0; j < n; j++) {
//                arr[j] = sc.nextInt();
//            }
//            System.out.println(arrStu(arr, n));
//        }
//    }
//    public static String arrStu(int[] arr, int n ){
//        int[] newArr = new int[n];
//        for(int i = 0; i<n ;i++){
//            newArr[i] = arr[i];
//        }
//        Arrays.sort(newArr);
//        int count = 0;
//        for(int i = 0 ; i< n ;i++){
//            if(arr[i] != newArr[i]) count++;
//        }
//        if(count > 2) return "NO";
//        else return "YES";
//    }
//
//     private static void sort(int[] newArr) {
//     }
// }


//Using Sort Method
//import java.util.*;
//public class Arrays
//{
//    public static void main(String[] args)
//    {
////defining an array of integer type
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int [] arr = new int [n];
////invoking sort() method of the Arrays class
//        Arrays.sort(arr);
//        System.out.println("Elements of array sorted in ascending order: ");
////prints array using the for loop
//        for (int i = 0; i < arr.length; i++)
//        {
//            System.out.println(arr[i]);
//        }
//    }
//
//    private static void sort(int[] arr) {
//    }
//}

