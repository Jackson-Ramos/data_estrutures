package collections.sequential;
@SuppressWarnings("unchecked")
public class SequentialList<T> {


    private T[] elements;
    private Integer size;

    public SequentialList() {
        this.elements = (T[]) new Object[10];
        this.size = 0;
    }

    /**
     * Verifies if the list is full.
     * 
     * @return true if the list is full, false otherwise
     */
    private Boolean isFull() {
        return this.size == this.elements.length;
    }

    /**
     * Resizes the list to double its current size.
     * 
     * The list is resized when it is full, to allow for new elements to be added.
     * The resize operation is performed by creating a new array with double the size of the current array, and then copying the elements from the current array to the new array. Finally, the new array is assigned to the elements field.
     */
    private void resize() {
        T[] newElements = (T[]) new Object[this.elements.length * 2];

        for (int i = 0; i < this.elements.length; i++) {
            newElements[i] = this.elements[i];
        }

        this.elements = newElements;
    }


    /**
     * Adds an element to the end of the list.
     * 
     * This method verifies if the list is full, and if so, resizes the list to double its current size. Then, the element is added to the end of the list by assigning it to the element at the current size index, and finally, the size field is incremented.
     * 
     * @param element the element to be added
     */
    public void add(T element) {
        if (isFull()) {
            resize();
        }

        this.elements[size] = element;
        this.size++;
    }

    public T get(int index) {
        return this.elements[index];
    }

    public Integer size() {
        return this.size;
    }

    /**
     * Checks if the list is empty.
     *
     * @return true if the list is empty, false otherwise
     */
    public Boolean isEmpty() {
        return this.size == 0;
    }

    /**
     * Removes the element at the specified index from the list.
     *
     * Shifts any subsequent elements to the left (subtracts one from their indices).
     * Returns the element that was removed from the list.
     *
     * @param index the index of the element to be removed
     * @return the element removed from the list
     */
    public T remove(int index) {
        T element = this.elements[index];
        T[] newElements = (T[]) new Object[this.elements.length];
        for (int i = 0; i < this.elements.length; i++) {
            if (i < index) {
                newElements[i] = this.elements[i];
            } else if (i > index) {
                newElements[i - 1] = this.elements[i];
            }
        }
        this.elements = newElements;
        this.size--;
        return element;
    }
}