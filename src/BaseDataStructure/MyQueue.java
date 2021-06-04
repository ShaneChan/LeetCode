package BaseDataStructure;

public class MyQueue {
    final static int MAX_SIZE = 128;
    final static int MIN_SIZE = 0;
    int[] array;
    int head, tail;

    MyQueue() {
        head = tail = 0;
        array = new int[MAX_SIZE];
    }

    public boolean enqueue(int val) {
        if (head == MAX_SIZE - 1) {
            throw new ArrayIndexOutOfBoundsException(MAX_SIZE);
        }

        array[head++] = val;
        return true;
    }

    public int dequeue() {
        if (head == tail) {
            throw new ArrayIndexOutOfBoundsException(0);
        }

        return array[tail++];
    }
}
