
// Q1. Tower of Hanoi - Transfer n disks from source to destination over 3 towers.
//
//public class Recursion {
//    public static void towerOfHanoi(int n, String src, String helper, String dest) {
//        if(n == 1) {
//            System.out.println("transfer disk " + n + " from " + src + " to " + dest);
//            return;
//        }
////transfer top n-1 from src to helper using dest as 'helper'
//        towerOfHanoi(n-1, src, dest, helper);
////transfer nth from src to dest
//        System.out.println("transfer disk " + n + " from " + src + " to " + helper);
////transfer n-1 from helper to dest using src as 'helper'
//        towerOfHanoi(n-1, helper, src, dest);
//    }
//    public static void main(String args[]) {
//        int n = 4;
//        towerOfHanoi(n, "A", "B", "C");
//    }
//}
//
//
//// print a string in a reverse
//
////public class Recursion {
////    public static String revString(String str) {
////        if(str.length() == 1) {
////            return str;
////        }
////        char currChar = str.charAt(0);
////        String nextString = revString(str.substring(1));
////        return nextString + currChar;
////    }
////    public static void main(String args[]) {
////
////        String str = "abcd";
////        String reversed = revString(str);
////        System.out.println(reversed);
////    }
////}
//
//
//// Q3. Find the occurrence of the first and last occurrence of an element using recursion.
////public class Recursion {
////    public static int first = -1;
////    public static int last = -1;
////    public static void getIndices(String str, char el, int idx) {
////        if(idx == str.length()) {
////            return;
////        }
////        if(str.charAt(idx) == el) {
////            if(first == -1) {
////                first = idx;
////            } else {
////                last = idx;
////            }
////        }
////        getIndices(str, el, idx+1);
////    }
////    public static void main(String args[]) {
////        String str = "tabcdfghijakkk";
////        char el = 'a';
////        getIndices(str, el, 0);
////        System.out.println("First occurence : " + first);
////        System.out.println("Last occurence : " + last);
////    }
////}
//
//// Q4. Check if an array is sorted (strictly increasing). - O(n)
////public class Recursion {
////    public static boolean checkIfIncreasing(int arr[], int idx) {
////
////        if(idx == arr.length-1) {
////            return true;
////        }
////        if(!checkIfIncreasing(arr, idx+1)) {
////            return false;
////        }
////        return arr[idx] < arr[idx + 1];
////    }
////    public static void main(String args[]) {
////        int arr1[] = {1, 2, 3, 4, 5};
////        int arr2[] = {1, 6, 3, 4, 5};
////        if(checkIfIncreasing(arr2, 0)) {
////            System.out.println("Strictly Increasing");
////        } else {
////            System.out.println("NOT Strictly Increasing");
////        }
////    }
////}
//
//
//// Q5. Move all ‘x’ to the end of the string. - O(n)
////public class Recursion {
////    //to add all 'x' to the end of the string
////    public static String addX(int count) {
////        String newStr = "x";
////        for(int i=1;i<count; i++) {
////            newStr += 'x';
////        }
////        return newStr;
////    }
////    public static String moveAllX(String str, int idx, int count) {
////        if(idx == str.length()) {
////            return addX(count);
////        }
////        if(str.charAt(idx) == 'x') {
////
////            return moveAllX(str, idx+1, count+1);
////        } else {
////            String nextStr = moveAllX(str, idx+1, count);
////            return str.charAt(idx) + nextStr;
////        }
////    }
////    public static void main(String args[]) {
////        String str = "abcdefxghxixjxxxk";
////        int count = 0;
////        String newStr = moveAllX(str, 0, count);
////        System.out.println(newStr);
////    }
////}
//
//// Q6. Remove duplicates in a string.
////public class Recursion {
////    public static String removeDuplicates(String str, int idx, boolean present[]) {
////        if(idx == str.length()) {
////            return "";
////        }
////        char curr = str.charAt(idx);
////        if(present[curr-'a']) {
////            return removeDuplicates(str, idx+1, present);
////        } else {
////            present[curr-'a'] = true;
////            return curr + removeDuplicates(str, idx+1, present);
////        }
////    }
////    public static void main(String args[]) {
////        String str = "abcadbcefghabi";
////        boolean present[] = new boolean[str.length()];
////        System.out.println(removeDuplicates(str, 0, present));
////    }
////}
//
//
//// Q7. Print all the subsequences of a string.
////public class Recursion {
////    public static void printSubseq(String str, int idx, String res) {
////        if(idx == str.length()) {
////            System.out.println(res);
////            return;
////        }
//////choose
////        printSubseq(str, idx+1, res+str.charAt(idx));
//////don't choose
////        printSubseq(str, idx+1, res);
////    }
////    public static void main(String args[]) {
////        String str1 = "abc";
////        String str2 = "aaa";
////        printSubseq(str1, 0, "");
////    }
////}
//
//    //Time complexity - O(2^n)
//
//// Q8. Print all unique subsequences of a string.
////import java.util.HashSet;
////public class Recursion {
////    public static void printSubseq(String str, int idx, String res, HashSet<String>
////            allSubseq) {
////        if(idx == str.length()) {
////            if(allSubseq.contains(res)) {
////                return;
////            }
////            allSubseq.add(res);
////            System.out.println(res);
////            return;
////        }
////
//////choose
////        printSubseq(str, idx+1, res+str.charAt(idx), allSubseq);
//////don't choose
////        printSubseq(str, idx+1, res, allSubseq);
////    }
////    public static void main(String args[]) {
////        String str1 = "abc";
////        String str2 = "aaa";
////        HashSet<String> allSubseq = new HashSet<>();
////        printSubseq(str2, 0, "", allSubseq);
////    }
////}
//
//// Q5. Print the fibonacci sequence till nth term.
////class Recursion1 {
////    public static void printFactorial(int a, int b, int n) {
////        if(n == 0) {
////            return;
////        }
////        System.out.println(a);
////        printFactorial(b, a+b, n-1);
////    }
////    public static void main(String args[]) {
////        printFactorial(0, 1, 5);
////    }
////}
//
//// Q7. Print x^n (with stack height = logn)
////class Recursion {
////    public static int printPower(int x, int n) {
////        if(n == 0) {
////            return 1;
////        }
////        if(n % 2 == 0) {
////            return printPower(x, n/2) * printPower(x, n/2);
////        }
////        else {
////            return x * printPower(x, n/2) * printPower(x, n/2);
////        }
////    }
////    public static void main(String args[]) {
////        int x = 2, n = 5;
////        int output = printPower(x, n);
////        System.out.println(output);
////    }
////}
//
//// Recursion Advance Question;
//
//// Q1. Print all the permutations of a string.
//
////public class Recursion {
////
////    public static void printPermutation(String str, int idx, String perm) {
////        if(str.length() == 0) {
////            System.out.println(perm);
////            return;
////        }
////
////        for(int i=0; i<str.length(); i++) {
////            char currChar = str.charAt(i);
////            String newStr = str.substring(0, i) + str.substring(i+1);
////            printPermutation(newStr, idx+1, perm+currChar);
////        }
////    }
////    public static void main(String args[]) {
////        String str = "abc";
////        printPermutation(str, 0, "");
////    }
////}
////Time complexity - O(n*n!)
//
//
////Q2. CountPathMaze
////public class Recursion {
////
////    public static int countPaths(int i, int j, int m, int n) {
////        if(i == m-1 || j == n-1) {
////            return 1;
////        }
////
////        return countPaths(i+1, j, m, n) + countPaths(i, j+1, m, n);
////    }
////
////    public static void main(String args[]) {
////        int m = 4, n = 5;
////        System.out.println(countPaths(0, 0, m, n));
////    }
////}
////Time complexity - O(2^(m+n))
//
//
////Q3. Tiling problem
//
////public class Recursion {
////
////    public static int placeTiles(int n, int m) {
////        if(n < m) {
////            return 1;
////        } else if(n == m) {
////            return 2;
////        }
////
////        return placeTiles(n-1, m) + placeTiles(n-m, m);
////    }
////
////    public static void main(String args[]) {
////        int n = 4, m = 4;
////        System.out.println(placeTiles(n, m));
////    }
////}
//
////Q4. Friends pairing problem
//
////public class Recursion {
////
////    public static int pairFriends(int n) {
////        if(n <= 1) {
////            return 1;
////        }
////
////        return pairFriends(n-1) + (n-1) * pairFriends(n-2);
////    }
////
////    public static void main(String args[]) {
////        int n = 3;
////        System.out.println(pairFriends(n));
////    }
////}
//
//
////Q5. Subsets of a set
//
//import java.util.ArrayList;
//
//public class Recursion {
//
//    public static void printSubsets(ArrayList<Integer> subset) {
//        for(int i=0; i<subset.size(); i++) {
//            System.out.print(subset.get(i)+" ");
//        }
//        System.out.println();
//    }
//
//    public static void findSubsets(int n, ArrayList<Integer> subset) {
//        if(n == 0) {
//            printSubsets(subset);
//            return;
//        }
//
//        findSubsets(n-1, subset);
//        subset.add(n);
//        findSubsets(n-1, subset);
//        subset.remove(subset.size() - 1);
//    }
//
//    public static void main(String args[]) {
//        int n = 3;
//        findSubsets(n, new ArrayList<Integer> ());
//    }
//}
//
//
//   Palindrome
import java.util.Scanner;
class sum
{
    public static int palindrome_check(char [] s, int start, int end)
    {
        if(start==end || (end-start==1))
        {
            return 1;
        }
        else
        {
            if(s[start]==s[end])
            {
                return palindrome_check(s,start+1,end-1);
            }
            else
            {
                return 0;
            }
        }
    }
    public static void main(String[] args)
    {
        Scanner sr = new Scanner(System.in);
        String s = sr.next();
        char a[] = s.toCharArray();
        int n = s.length();
        if(palindrome_check(a,0,n-1)==1)
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }
    }
}
