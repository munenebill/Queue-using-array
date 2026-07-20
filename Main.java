
public class Main {

    static final int MAX = 5;
    static int[] queue = new int[MAX];
    static int front = -1, rear = -1;

    // Enqueue
    static void enqueue(int x) {
        if (rear == MAX - 1) {
            System.out.println("The Queue is Full!!");
        } else {
            if (front == -1)
                front = 0;

            rear++;
            queue[rear] = x;
            System.out.println(x + " has been Queued!");
        }
    }

    // Dequeue
    static int dequeue() {
        if (front == -1 || front > rear) {
            System.out.println("The Queue is Empty!!");
            front = rear = -1;
            return -1;
        } else {
            int x = queue[front];
            front++;

            if (front > rear) {
                front = rear = -1;
            }

            System.out.println(x + " has been dequeued!");
            return x;
        }
    }

    public static void main(String[] args) {
        enqueue(10);
        enqueue(20);
        enqueue(30);
        enqueue(40);
        enqueue(50);
        enqueue(60); // Full

        dequeue();
        dequeue();
        dequeue();
        dequeue();
        dequeue();
        dequeue(); // Empty
    }
}