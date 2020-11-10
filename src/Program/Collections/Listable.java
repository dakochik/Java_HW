package Program.Collections;

public interface Listable<T> {
    /***
     * Method returns element from list by index.
     * @param index index of element.
     * @return element by that index.
     * @throws IllegalArgumentException when index more number of list elements or when it's negative.
     */
    T get(int index) throws IllegalArgumentException;

    /***
     * Method adds element at the back of list.
     * @param newElement element we need to add
     */
    void put(T newElement);

    /***
     * Method counts and returns number of list elements.
     * @return number of list elements.
     */
    int getSize();

    /***
     * Method checks if list contains method argument.
     * @param element element which we checked for
     * @return if list contains checked element
     */
    boolean contains(T element);

    /***
     * Method removes all elements and make it with default length.
     */
    void clear();
}
