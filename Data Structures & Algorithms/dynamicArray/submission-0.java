public class DynamicArray {
    private int[] arr;
    private int size;
    private int capacity;

    // Constructor
    public DynamicArray(int capacity) {
        if (capacity <= 0) {
            throw new IllegalArgumentException("Capacity must be greater than 0");
        }
        this.capacity = capacity;
        this.arr = new int[capacity];
        this.size = 0;
    }

    // Get element at index i
    public int get(int i) {
        if (i < 0 || i >= size) {
            throw new IndexOutOfBoundsException("Invalid index");
        }
        return arr[i];
    }

    // Set element at index i
    public void set(int i, int n) {
        if (i < 0 || i >= size) {
            throw new IndexOutOfBoundsException("Invalid index");
        }
        arr[i] = n;
    }

    // Push element to the end
    public void pushback(int n) {
        if (size == capacity) {
            resize();
        }
        arr[size] = n;
        size++;
    }

    // Pop element from the end
    public int popback() {
        if (size == 0) {
            throw new IllegalStateException("Array is empty");
        }
        int val = arr[size - 1];
        size--;
        return val;
    }

    // Double the capacity
    public void resize() {
        capacity *= 2;
        int[] newArr = new int[capacity];
        for (int i = 0; i < size; i++) {
            newArr[i] = arr[i];
        }
        arr = newArr;
    }

    // Return current size
    public int getSize() {
        return size;
    }

    // Return current capacity
    public int getCapacity() {
        return capacity;
    }
}
