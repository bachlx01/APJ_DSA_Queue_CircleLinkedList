public class CircleQueue {
    public static void main(String[] args) {
        Queue<Integer> test = new Queue<Integer>(1);
        test.enQueue(2);
        test.enQueue(3);
        test.enQueue(4);
        test.deQueue();
        test.deQueue();
        System.out.println(test.toString());
    }
}
