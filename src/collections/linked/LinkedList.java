package collections.linked;

public class LinkedList<T> {

    private No<T> head;
    private Long size;

    /**
     * Adds an element to the end of the linked list.
     * 
     * @param element the element to be added
     */
    public void addEnd(T element) {

        No<T> newNo = new No<>(element);

        if (head == null) {
            head = newNo;
        } else {
            No<T> aux = head;
            while (aux.getNext() != null) {
                aux = aux.getNext();
            }
            aux.setNext(newNo);
        }
        size++;
    }

    public void  addStart(T element) {
        No<T> newNo = new No<>(element);


}
