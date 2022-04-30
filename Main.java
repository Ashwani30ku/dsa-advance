import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        int intDaata;
        Long LongData;
        float floatData;
        Double DoubleData;
        char charData;

        Scanner sc=new Scanner(System.in);

        // Your code here
        intDaata=sc.nextInt();
        LongData=sc.nextLong();
        floatData = sc.nextInt();
        DoubleData=sc.nextDouble();
        charData=sc.next().charAt(0);
        System.out.println(intDaata);
        System.out.println(LongData);
        System.out.println(floatData);
        System.out.println(DoubleData);
        System.out.println(charData);


    }
}
