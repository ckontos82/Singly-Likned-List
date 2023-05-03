/**
 * Represents a simple node in a singly linked list.
 *
 * @param <T> the type of element stored in the node
 * @author Charalampos Kontos
 */

public class SinglyLinkedListNode<T> {
    private SinglyLinkedListNode<T> next;
    private T element;

    /**
     * Constructs a new simple node.
     *
     * @param next    the next node in the list
     * @param element the element stored in this node
     */
    public SinglyLinkedListNode(SinglyLinkedListNode<T> next, T element) {
        this.next = next;
        this.element = element;
    }

    /**
     * Returns the element stored in this node.
     *
     * @return the element stored in this node
     */
    public T getElement() {
        return element;
    }

    /**
     * Returns the next node in the list.
     *
     * @return the next node in the list
     */
    public SinglyLinkedListNode<T> getNext() {
        return next;
    }

    /**
     * Sets the element stored in this node.
     *
     * @param element the element to store in this node
     */
    public void setElement(T element) {
        this.element = element;
    }

    /**
     * Sets the next node in the list.
     *
     * @param next the next node in the list
     */
    public void setNext(SinglyLinkedListNode<T> next) {
        this.next = next;
    }
}
