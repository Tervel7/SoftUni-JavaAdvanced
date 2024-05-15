package DefiningClasses.CustomStack;

public class CustomStack {
    public static final int INITIAL_CAPACITY = 4;
    public static final int INITIAL_SIZE = 0;

    private int[] data;
    private int size;
    private int capacity;

    CustomStack() {
        this.data = new int[INITIAL_CAPACITY];
        this.capacity = INITIAL_CAPACITY;
        this.size = 0;
    }

    public int getSize() {
        return  this.size;
    }


    public void push(int element) {
        this.ensureCapacity();
        this.data[this.size] = element;
        size++;
    }

    public int pop() {
        this.ensureCustomStackNotEmpty();
        int deletedElement = this.data[size-1];
        this.size--;
        return deletedElement;
    }


    public int peek() {
        return  this.data[this.size-1];
    }

    private void ensureCustomStackNotEmpty() {
        if (this.size==0)
            throw new IndexOutOfBoundsException("CustomStack is empty!");
    }

    /* private void shiftAllRight() {
        int[] temp = new int[this.capacity];
        for(int i=0, j=1; i<this.size; i++) {
            temp[j] = this.data[i];
            j++;
        }
        this.data = temp;
    } */

    private void ensureCapacity() {
        if (this.size==this.capacity)
            this.resize();
    }

    private void resize() {
        this.capacity = this.capacity * 2;
        int[] temp = new int[this.capacity];
        for (int i=0; i<this.size; i++)
            temp[i] = this.data[i];
        this.data = temp;
    }
}
