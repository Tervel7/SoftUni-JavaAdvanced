package DefiningClasses.SmartArray;

import java.util.function.Consumer;

public class SmartArray {
    public static final int INITIAL_CAPACITY = 4;
    public static final int INITIAL_SIZE = 0;

    private int[] data;
    private int size;
    private int capacity;

    SmartArray() {
        this.size = INITIAL_SIZE;
        this.capacity = INITIAL_CAPACITY;
        this.data = new int[INITIAL_CAPACITY];
    }

    public void add(int element) {
        if(this.size == this.capacity)
            this.resize();
        this.data[size] = element;
        size++;
    }

    public void add(int index, int element) {
        this.checkIndex(index);
        this.capacity +=1;
        this.size += 1;

        int[] temp = new int[data.length+1];

        for (int i=0, j =0; i<temp.length; i++) {
            if(i==index) {
                temp[i] = element;
            } else
                temp[i] = data[j++];
        }

        this.data = temp;
    }

    public int size() {
        return this.size;
    }

    public int get(int index) {
        this.checkIndex(index);
        return this.data[index];
    }

    public int remove(int index) {
        int removedElement = this.get(index);
        this.shift(index);
        this.size -= 1;
        if(this.capacity/this.size>=4)
            this.shrink();
        return removedElement;
    }

    public boolean contains(int element) {
        for (int i=0; i<this.size;i++) {
            if(this.data[i] == element)
                return true;
        }
        return false;
    }

    public void forEach(Consumer<Integer> consumer) {
        for (int i=0; i<this.size; i++) {
            consumer.accept(this.data[i]);
        }
    }

    private void checkIndex(int index) {
        if(index>=this.size || index<0)
            throw new IndexOutOfBoundsException("Index " + index + " is out of bound for this array.");
    }

    private void resize() {
        this.capacity = this.capacity * 2;
        int[] temp = new int [capacity];
        for (int i = 0; i < this.size; i++) {
            temp[i] = this.data[i];
        }
        this.data = temp;
    }

    private void shrink() {
        this.capacity = this.capacity/2;
        int[] temp = new int [capacity];
        for (int i = 0; i < size; i++) {
            temp[i] = this.data[i];
        }
        this.data = temp;
    }

    private void shift(int index) {
        for (int i = index; i<=this.size; i++) {
            if(i==this.size-1) {
                data[i] = 0;
                break;
            }
            data[i] = data[i+1];
        }
    }

}
