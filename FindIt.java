import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class FindIt {
    public static void main (String[] args) {
        // Your code here

        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();
        long ans = -1;
        for(long i = 1; i <= Math.sqrt(n); i++){
            if(n == ( Math.pow(i,2)) + (3*i)){
                ans = i;
            }
        }

        System.out.print(ans);

    }
}