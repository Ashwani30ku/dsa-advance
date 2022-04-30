import java.util.Stack;

public class QueueusingStacks {

    // Stack -> LIFo
    //  Stack -> lifo ......
    // s1->3 2 1
    // s2->


    // queue ->fifo

    Stack<Integer> s1=new Stack();
    Stack<Integer> s2=new Stack();

    void enqueue(int n){
        while(!s1.empty()){
            s2.push(s1.pop());
        }
        s1.push(n);
        while(!s2.empty()){
            s1.push(s2.pop());
        }
    }

    int deque(){
        if(s1.empty()){
            System.out.println("Empty Queue");
            return -1;
        }
        int x=s1.peek();
        s1.pop();
        return x;
    }
    public static void main(String[] args) {
        QueueusingStacks queue=new QueueusingStacks();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);
        queue.enqueue(6);
// 1 2 3 4 5 6
        System.out.println(queue.deque());
        System.out.println(queue.deque());
        System.out.println(queue.deque());

    }
}