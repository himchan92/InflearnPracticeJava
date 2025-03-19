package collection.array;

public class MyArrayListV1 {
    private static final int DEFAULT_CAPACITY = 5;

    private Object[] elementDate;
    private int size = 0;

    public MyArrayListV1() {
        elementDate = new Object[DEFAULT_CAPACITY];
    }

    public MyArrayListV1(int initCapacity) {
        elementDate = new Object[initCapacity];
    }

    public int size() {
        return size;
    }

    public void add(Object e) {
        elementDate[size] = e;
        size++;
    }

    public Object get(int index) {
        return elementDate[index];
    }

    public Object set(int index, Object element) {
        Object oldValue = get(index);
        elementDate[index] = element;
        return oldValue;
    }

    public int indexOf(Object o) {
        for (int i = 0; i < size; i++) {
            if(o.equals(elementDate[i])) {
                return i;
            }
        }
        return -1;
    }
}
