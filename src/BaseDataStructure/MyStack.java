package BaseDataStructure;

import java.util.concurrent.ExecutionException;

public class MyStack {
    final static int MAX_SIZE = 128;
    final static int MIN_SIZE = 0;
    int[] array;
    int length;

    MyStack(int n) {
        array = new int[MAX_SIZE];
    }

    public boolean push(int val) {
        if (length == MAX_SIZE) { // 已到栈的最大值，返回push失败，返回false
            return false;
        }

        array[length++] = val;
        return true;
    }

    public int pop(){
        if (length == MIN_SIZE) { // 栈里已没有元素，抛出异常
            throw new ArrayIndexOutOfBoundsException(length - 1);
        }

        return array[--length];
    }

    public int peek() {
        if (length == MIN_SIZE) { // 战力已没有元素，抛出异常
            throw new ArrayIndexOutOfBoundsException(length - 1);
        }

        return array[length - 1];
    }


    boolean isEmpty() {return length == 0;}
}
