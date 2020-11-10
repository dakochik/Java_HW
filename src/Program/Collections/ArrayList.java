package Program.Collections;

public class ArrayList<T> implements Listable<T> {
    /***
     * Size of list when ir's creating.
     */
    private static final int DEFAULT_ARR_SIZE = 8;

    /***
     * List length expansion coefficient. It is used in put method().
     */
    private static final int DEFAULT_ARR_EXP_COEFF = 2;

    /***
     * Array which contains elements of List.
     */
    private Object[] array;

    /***
     * Max current capacity of array
     */
    private int capacity;

    /***
     * Number of added elements.
     */
    private int totalElements;

    public ArrayList() {
        capacity = DEFAULT_ARR_SIZE;
        array = new Object[capacity];
        totalElements = 0;
    }

    public ArrayList(T[] params) {
        totalElements = params.length;
        capacity = totalElements + DEFAULT_ARR_SIZE;
        array = new Object[capacity];
        for (int i = 0; i < totalElements; ++i) {
            array[i] = params[i];
        }
    }

    @Override
    public T get(int index){
        if (index < totalElements) {
            return ((T) array[index]);
        }
        throw new IllegalArgumentException("Index " + index + " out of list bound");
    }

    @Override
    public void put(T newElement) {
        if (totalElements + 1 == capacity) {
            Object[] newArray = new Object[capacity * DEFAULT_ARR_EXP_COEFF];
            System.arraycopy(array, 0, newArray, 0, array.length);
            array = newArray;
        }
        array[totalElements] = newElement;
        ++totalElements;
    }

    @Override
    public int getSize() {
        return totalElements;
    }

    @Override
    public boolean contains(T element) {
        for (int i = 0; i < totalElements; ++i) {
            if (array[i].equals(element)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void clear() {
        totalElements = 0;
        capacity = DEFAULT_ARR_SIZE;
        array = new Object[capacity];
    }
}
