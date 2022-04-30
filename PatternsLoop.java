// 1. pattern Question;
//import java.util.*;
//
//public class PatternsLoop {
//    public static void main(String args[]) {
//        int n = 5;
//        int m = 6;
//        for(int i=0; i<n; i++) {
//            for(int j=0; j<m; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//    }
//}


// 2. pattern Question;
//import java.util.*;
//
//public class PatternsLoop {
//    public static void main(String args[]) {
//        int n = 5;
//        int m = 4;
//        for(int i=0; i<n; i++) {
//            for(int j=0; j<m; j++) {
//                if(i == 0 || i == n-1 || j == 0 || j == m-1) {
//                    System.out.print("*");
//                } else {
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }
//    }
//}


// 3. pattern Question;

//import java.util.*;
//
//public class PatternsLoop {
//    public static void main(String args[]) {
//        int n = 4;
//
//        for(int i=1; i<=n; i++) {
//            for(int j=1; j<=i; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//    }
//}


// 3.pattern Question;
//import java.util.*;
//
//public class Patterns {
//    public static void main(String args[]) {
//        int n = 4;
//
//        for(int i=n; i>=1; i--) {
//            for(int j=1; j<=i; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//    }
//}


// 4. pattern Question;

import java.util.*;

public class PatternsLoop {
    public static void main(String args[]) {
        int n = 10;
        for(int i=1; i<=n; i++) {
            //spaces
            for(int j=1; j<=n-i; j++) {
                System.out.print(" ");
            }

            //first part
            for(int j=i; j>=1; j--) {
                System.out.print(j);
            }

            //second part
            for(int j=2; j<=i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}

// 5.pattern Question;
//import java.util.*;
//
//public class PatternsLoop{
//    public static void main(String args[]) {
//        int n = 5;
//
//        //upper part
//        for(int i=1; i<=n; i++) {
//            //spaces
//            for(int j=1; j<=n-i; j++) {
//                System.out.print(" ");
//            }
//            for(int j=1; j<=2*i-1; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//
//        //lower part
//        for(int i=n; i>=1; i--) {
//            //spaces
//            for(int j=1; j<=n-i; j++) {
//                System.out.print(" ");
//            }
//            for(int j=1; j<=2*i-1; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//    }
//}





