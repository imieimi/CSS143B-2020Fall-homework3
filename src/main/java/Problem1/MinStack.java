package Problem1;

public class MinStack extends ArrayStack<Integer> {
    // okay to add member variables
    // can only use Stack interface and ArrayStack from this folder
    // do not use Java Stack
    private int[] data;
    private int size;
    private int min;


    public MinStack(int size) {
        // homework
        super(size); // place holder
        data = new int[size];
        this.size = size;
    }

    @Override
    public boolean push(Integer val) {
        // homework
        //return false; // place holder
        if(size > data.length){
            return false;
        }else{
            data[size] = val;
            return true;
        }
    }

    @Override
    public Integer pop() {
        // homework
        //return -1; // place holder
        return data[--size];
    }

    public Integer getMin() {
        // homework
        // loop of any kind is not allowed
        //return -1; // place holder
        return min;
    }
}

