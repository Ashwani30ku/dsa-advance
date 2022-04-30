public class BinaryNumber {
    // linklist Node
    static class Node{
        boolean data;
        Node next;
    }
    static int decimalvalue(Node head){
        // inestialized result
        int res=0;
        // Traverse linkedlist
        while (head!=null){
            // Multiply result by 2 and add
            res=(res<< 1)+(head.data?1:0);
            // Move next
            head=head.next;
        }
        return res;
    }
    static Node newNode(int data){
        Node temp=new Node();
        temp.data=(data==1? true:false);
        return temp;
    }

    public static void main(String[] args) {
        // start with the empty list
        Node head=newNode(1);
        head.next=newNode(0);
        head.next.next=newNode(1);
        System.out.print("Decimal value is " + decimalvalue(head));
    }
}
