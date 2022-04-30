public class ScratchImplQueue {
    // Array implementation of queue
    int front;
    int rear;
    int capacity;
    int[] queue;
    //      [ , , , , , , , , , ]
    //      f                    r
    ScratchImplQueue(int size){
        queue=new int[size];
        capacity=size;
        front=0;
        rear=0;
    }

    public void enqueue(int n){

        if(capacity==rear){
            System.out.println("Queue overflow");
            return;
        }

        queue[rear]=n;
        rear++;
    }
    //  [56789
    // [9 8 7 6 5 4  ]
    //  f           r
    public int dequeue() {
        if(front==rear){
            System.out.println("Empty queue");
            return -1;
        }

        int deququeElement=queue[front];

        for(int i=0;i<rear-1;i++){
            queue[i]=queue[i+1];
        }

        rear--;
        return deququeElement;

    }

    public void printQueue(){
        if(front==rear){
            System.out.println("Empty queue");
            return;
        }

        for(int i=front;i<rear;i++){
            System.out.print(queue[i]+" ");
        }
        System.out.println();
    }
    // way to in -> [4,5,6,7,8,9, , , , ]-> way to out

    public static void main(String[] args) {
        ScratchImplQueue obj=new ScratchImplQueue(10);
// push pop
        // enqueue , dequeue
        // Class obj=new Class();
        // obj.fun();
        obj.enqueue(10);
        obj.enqueue(20);
        obj.enqueue(30);
        obj.enqueue(40);
        obj.enqueue(50);
        obj.enqueue(60);

        obj.printQueue();

        obj.dequeue();

        obj.printQueue();

        obj.dequeue();

        obj.printQueue();

        obj.enqueue(100);

        obj.printQueue();

        System.out.println(obj.dequeue());

        obj.printQueue();

    }
}