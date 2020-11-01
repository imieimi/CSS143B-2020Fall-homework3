package Problem1;

public class ArrayStack<T> implements Stack<T> {
    // do not change member variables
    private T[] data;
    private int size;

    private ArrayStack() {
    }

    public ArrayStack(int capacity) {
        // homework
        size = capacity;
        data = (T[])(new Object[capacity]);
    }

    @Override
    public boolean push(T val) {
        // homework
        if(size == data.length) {
            return false;
        }else{
            data[size] = val;
            size++;
            return true;
        }
    }

    @Override
    public T pop() {
        // homework
        //T val = null;   // place holder
        //return val;   // place holder
        return data[--size];
    }

    @Override
    public T peek() {
        // homework
        //T val = null;   // place holder
        //return data.val;   // place holder
        return data[size-1];
    }

    @Override
    public int size() {

        return size;
    }
}
