import java.util.Scanner;

public class BitManipulation {
// number -> if it is even or odd using bit manipulation

    // k,n-> check if nth bit is set or not
    // 101010010101 -> 4 -> true
    public static boolean checkOddEven(int x) {
        //x= 4 -> 100   -> 010  -> 2
        //       4  2 1
        //  x & 1

        // 7 ->
        // 110 & 001 -> 001
        // 001
        //-> 0
        if((x&1)==0){
            return  true;
        }
        else
            return false;
    }

    public static boolean nthBitSet(int x, int n){
        // 7-> 111  -> 111
        // 4 -> 110 &
        // 1
        // 111
        // 100
        // 100
        // 1000

        // 111
        // 100
        // 0
        if( (x & (1<<(n-1))) >0 ){
            return true;
        }
        else {
            return false;
        }
    }

    public static int setNthBit(int x, int n){
        return x | (1<<(n-1));
    }

    public static int unSetNthBit(int x, int n){
        return x & ~(1<<(n-1));
    }


    // 10011
    //  16 8 4 21
    // 19


    //8 4
    // 1000
    // 0111
    // 0000


    public static int toggleNthBit(int x, int n){
        return x ^ (1<<(n-1));
    }

    //  10011
    //      16 8 4 21
    //     19

    // 3
    // 10111  ^ 00100
    // -> 23

    //2
    // 10001    ^ 00010
    // -> 17


    public static int turnOffRightMostBit(int x){
        if((x&1)==0){
            return x;
        }
        else {
            return x & (x - 1);
        }
    }

    //   x & x & (x - 1)
    // 100
    // 011
    // 000

    // x= 10  -> 1010
    //          0001
    //          0000

    // 111 -> 7-> 110
    // 110 -> 6 -> 110


    // 01010111  -> 128  64 32  16 8 4 2 1  ->87


    // 01011000  ->88
    // 01010111   -> 87

    // 4-> 100
    // 3-> 011
    //


    // 10011 ^  00001 ->
    // 10011  & 00000
    // -> 10010
    // 10010 -> 10010


    // 100   -> 101
    // 101
    //
    // 101 -> 110
    public static int turnOnRightMostBit(int x){
        return x | (x+1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
//        if(checkOddEven(x))
//        {
//            System.out.println("Number is even");
//        }
//        else
//        {
//            System.out.println("Number is odd");
//        }
        int n=sc.nextInt();
//        if(nthBitSet(x,n)){
//            System.out.println("nth bit of x is set");
//        }
//        else{
//            System.out.println("nth bit of x is not  set");
//        }

//        System.out.println(setNthBit(x,n));

//        System.out.println(unSetNthBit(x,n));

//        System.out.println(toggleNthBit(x,n));

        //        System.out.println(turnOffRightMostBit(x));

        System.out.println(turnOnRightMostBit(x));
    }
}