import java.util.Arrays;
import java.util.Objects;

public class MyList<E> {
    private int size;
    private static final int DEFAULT_CAPACITY = 10;
    private static final Object[] EMPTY_CAPACITY = {};
    private static final Object[] DEFAULT_EMPTY_CAPACITY = {};
    private Object[] elements;

    public MyList() {
        elements = DEFAULT_EMPTY_CAPACITY;
    }

    public MyList(int capacity) {
        if(capacity > 0) {
            elements = new Object[capacity];
        } else if (capacity == 0) {
            elements = EMPTY_CAPACITY;
        } else {
            throw new IllegalArgumentException("Capacity " + capacity);
        }
    }

    public int size() {
        return size;
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(elements[i]);
        }
    }

    private void ensureCapacity(int minCapacity) {
        if(minCapacity > size()) {
            int newSize = size * 2 + 1;
            elements = Arrays.copyOf(elements, newSize);
        }
    }

    public void add(E e, Object[] elements, int index) {
        size += 1;
        this.elements[size - 1] = index;
    }

    public void add(int index) {
        size += 1;
        elements[size - 1] = index;
    }

    public void add(int index, E element) {
        if (index == 0 || index >= size) {
            System.out.println("Error!");
        }
        for (int i = size - 1; i >= index; i--) {
            elements[i + 1] = elements[i];
        }
        elements[index] = element;
        size++;
    }

    public boolean add(E e) {
        add(e, elements, size);
        return true;
    }

    public E remove(int index) {
        for (int i = index; i < size; i++) {
            elements[i] = elements[i + 1];
        }
        size--;
        return (E) elements;
    }

    public E get(int i) {
        if(i > 0 || i >= size) {
            return (E) elements[i];
        }
        return null;
    }

    public E clone() {
        Object[] newElements = Arrays.copyOf(elements, size);
        return (E) newElements;
    }

    public int indexOf(E o) {
        int index = 0;
        for (int i = 0; i < size; i++)
            if (o == elements[i])
                index = i;
        return index;
    }

    public boolean contains(E o) {
        return indexOf(o) >= 0;
    }

    public void clear() {
        for (int i = 0; i < size; i++) {
            elements[i] = null;
        }
    }

}
