import java.util.Arrays;

class ArrayImpl {
    int queue[];
    int front;
    int rear;
    int size;

    public ArrayImpl(int size) {
        this.size = size;
        this.queue = new int[size];
        this.front = 0;
        this.rear = -1;
    }

    public void enqueue(int num) {
        if (isFull()) {
            System.out.println("Queue is Full");
            return;
        }
        rear++;
        queue[rear] = num;
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return -1;
        }
        int temp = queue[front];
        for (int i = 0; i < rear; i++) {
            queue[i] = queue[i + 1];
        }
        rear--;
        return temp;
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return;
        }
        System.out.print("Queue: ");
        for (int i = 0; i <= rear; i++) {
            System.out.print(queue[i] + " ");
        }
        System.out.println();
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return -1;
        }
        return queue[front];
    }

    public boolean isEmpty() {
        return rear < front;
    }

    public boolean isFull() {
        return rear == size - 1;
    }
}

public class QueueArrayImpl {
    public static void main(String[] args) {
        ArrayImpl array = new ArrayImpl(5);
        array.enqueue(1);
        array.enqueue(2);
        array.enqueue(3);
        array.enqueue(4);
        array.enqueue(5);
        array.display();

        System.out.println("Dequeued: " + array.dequeue());
        array.display();

        System.out.println("Peek: " + array.peek());
    }
}
