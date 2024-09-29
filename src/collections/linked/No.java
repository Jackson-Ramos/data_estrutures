package collections.linked;

public class No<T> {

    private T element;
    private No<T> next;
    
    public No(T element, No<T> next) {
        this.element = element;
        this.next = next;
    }

    public No(T element) {
        this.element = element;
        this.next = null;
    }



    public T getElement() {
        return element;
    }

    public void setElement(T element) {
        this.element = element;
    }

    public No<T> getNext() {
        return next;
    }

    public void setNext(No<T> next) {
        this.next = next;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((element == null) ? 0 : element.hashCode());
        result = prime * result + ((next == null) ? 0 : next.hashCode());
        return result;
    }

    @SuppressWarnings("rawtypes")
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        No other = (No) obj;
        if (element == null) {
            if (other.element != null)
                return false;
        } else if (!element.equals(other.element))
            return false;
        if (next == null) {
            if (other.next != null)
                return false;
        } else if (!next.equals(other.next))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "No [element=" + element + ", next=" + next + "]";
    }

    
}
