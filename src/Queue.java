import java.util.Arrays;
import java.util.OptionalInt;

public class Queue<E> {
    private Node front;
    private Node rear;
    int size = 0;

    public Queue() {
    }

    public Queue(E data) {
        front = rear = new Node(data);
        front.next = rear;
        rear.next = front;
        size++;
    }

    public void enQueue(E data) {
        Node newData = new Node(data);
        if (size == 0) {
            rear = front = newData;
            front.next = rear;
        }
        rear.next = newData;
        newData.next = front;
        rear = newData;
        size++;
    }

    public void deQueue() {
        if (front == null){
            return;
        }else if (front == rear){
            front = rear = null;
        } else {
            front = front.next;
            rear.next = front;
        }
        size--;
    }

    @Override
    public String toString() {
        int[] dataArray = new int[size];
        Node temp = front;
        for (int i = 0; i < size; i++) {
            dataArray[i] = (int)temp.data;
            temp = temp.next;
        }
        return Arrays.toString(dataArray);
    }
}
