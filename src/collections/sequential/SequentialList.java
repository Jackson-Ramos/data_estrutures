package collections.sequential;
@SuppressWarnings("unchecked")
class SequentialList<T> {

    private T[] elements;
    private Integer size;

    public SequentialList() {
        this.elements = (T[]) new Object[10];
        this.size = 0;
    }

    private Boolean isFull() {
        return this.size == this.elements.length;
    }

    private void resize() {
        T[] newElements = (T[]) new Object[this.elements.length * 2];

        for (int i = 0; i < this.elements.length; i++) {
            newElements[i] = this.elements[i];
        }

        this.elements = newElements;
    }


    public void add(T element) {
        if (isFull()) {
            resize();
        }

        this.elements[size] = element;
        this.size++;
    }
}