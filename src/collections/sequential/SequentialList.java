package collections.sequential;
@SuppressWarnings("unchecked")
class SequentialList<T> {

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
}