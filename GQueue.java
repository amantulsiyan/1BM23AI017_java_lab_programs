/*
 * 6. Write a Java program to implement a dynamic, growable queue using generics. The queue should be
able to store elements of any data type and dynamically resize itself as needed to accommodate more
elements.
*/

import java.util.Arrays;

public class GQueue<T> {
    private T[] que;
    private int size;

    public GQueue() {
        que = (T[]) new Object[2];  // Unsafe cast warning is normal here
        size = 0;
    }

    public void enqueue(T element) {
        if (size == que.length) {
            int newCapacity = que.length * 2;
            que = Arrays.copyOf(que, newCapacity);
        }
        que[size++] = element;
    }

    public T dequeue() {
        if (size == 0) {
            System.out.println("Queue is empty");
            return null;  // Return null or throw exception here
        }
        T del_element = que[0];
        System.arraycopy(que, 1, que, 0, size - 1);
        que[--size] = null;
        return del_element;
    }

    public void display() {
        for (int i = 0; i < size; i++) {
            System.out.println(que[i]);
        }
    }

    public int getSize() {
        return size;
    }

    public static void main(String[] args) {
        // Create a GrowableQueue of integers
        GQueue<Integer> integerQueue = new GQueue<>();

        // Enqueue elements
        integerQueue.enqueue(10);
        integerQueue.enqueue(20);
        integerQueue.enqueue(30);

        System.out.println("Elements in the queue are:");
        integerQueue.display();

        // Dequeue an element
        Integer dequeuedElement = integerQueue.dequeue();
        System.out.println("Dequeued element: " + dequeuedElement);

        // Display size of the queue
        System.out.println("Queue size: " + integerQueue.getSize());
    }
}
