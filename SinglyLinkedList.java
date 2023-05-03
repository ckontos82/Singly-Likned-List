package gr.aueb.cf.testing.SLList;
/**
 * Represents a singly linked list.
 *
 * @param <T> the type of elements stored in the list
 */
public class SinglyLinkedList<T> {
    protected int noOfElements;
    protected SinglyLinkedListNode<T> head, tail;

    /**
     * Constructs an empty singly linked list.
     */
    public SinglyLinkedList() {
        noOfElements = 0;
        head = tail = null;
    }

    /**
     * Returns the number of elements in the list.
     *
     * @return the number of elements in the list
     */
    public int size() {
        return noOfElements;
    }

    /**
     * Checks if the list is empty.
     *
     * @return true if the list is empty, false otherwise
     */
    public boolean isEmpty() {
        return (noOfElements == 0);
    }

    /**
     * Checks if the given node is the head of the list.
     *
     * @param v the node to check
     * @return true if the node is the head of the list, false otherwise
     */
    public boolean isFirst(SinglyLinkedListNode<T> v) {
        return v == head;
    }

    /**
     * Returns the head of the list.
     *
     * @return the head of the list
     */
    public SinglyLinkedListNode<T> getHead() {
        if (isEmpty())
            System.out.println("The list is empty.");
        return head;
    }

    /**
     * Returns the tail of the list.
     *
     * @return the tail of the list
     */
    public SinglyLinkedListNode<T> getTail() {
        if (isEmpty())
            System.out.println("The list is empty.");
        return tail;
    }

    /**
     * Inserts a new element after the specified node.
     *
     * @param p       the node after which to insert the new element
     * @param element the element to insert
     * @return the new node containing the inserted element
     */
    public SinglyLinkedListNode<T> insertAfter(SinglyLinkedListNode<T> p, T element) {
        if (isEmpty()) {
            System.out.println("List is empty. Operation not permitted.");
            return null;
        }
        noOfElements++;
        SinglyLinkedListNode<T> q = new SinglyLinkedListNode<>(p.getNext(), element);
        if (p.getNext() == null)
            tail = q;
        p.setNext(q);
        return q;
    }

    /**
     * Inserts a new element at the beginning of the list.
     *
     * @param element the element to insert
     * @return the new node containing the inserted element
     */
    public SinglyLinkedListNode<T> insertFisrt(T element) {
        SinglyLinkedListNode<T> q = new SinglyLinkedListNode<>(head, element);
        head = q;

        if (++noOfElements == 1)
            tail = head;
        return q;
    }

    /**
     * Deletes the element following the specified node.
     *
     * @param p the node before the element to delete
     * @return the deleted element
     */
    public T deleteAfter(SinglyLinkedListNode<T> p) {
        if (p == tail) {
            System.out.println("Not possible delete after tail");
            return null;
        }

        noOfElements--;
        SinglyLinkedListNode<T> pNext = p.getNext();
        p.setNext(pNext.getNext());
        if (pNext == tail)
            tail = p;
        pNext.setNext(null);
        return pNext.getElement();
    }
}
