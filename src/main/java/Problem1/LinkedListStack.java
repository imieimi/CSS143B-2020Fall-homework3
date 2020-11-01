package Problem1;

import java.util.LinkedList;

public class LinkedListStack<T> implements Stack<T> {
    // use Java LinkedList to store the data
    // do not change member variables
    private LinkedList<T> data;

    public LinkedListStack() {
        // homework
        data = new LinkedList();
    }

    @Override
    public boolean push(T val) {
        // homework
        //return false;   // place holder
        data.push(val);
        return true;
    }

    @Override
    public T pop() {
        // homework
        //T val = null;   // place holder
        //return val;   // place holder
        return data.pop();
    }

    @Override
    public T peek() {
        // homework
        //T val = null;   // place holder
        //return val;   // place holder
        return data.peek();
    }

    @Override
    public int size() {

        return data.size();
    }
}
