package core.data.structure.linked.list.ilist;

/**
 * Class Node.
 */
public class Node<T> {
    private final T value;
    private Node<T> next;

    /**
     * Node Constructor.
     *
     * @param value Node value.
     */
    public Node(T value) {
        this.value = value;
        this.next = null;
    }

    /**
     * Method to get next Node.
     *
     * @return next, next Node.
     */
    public Node<T> getNext() {
        return next;
    }

    /**
     * Method to set next Node.
     *
     * @param newNode new Node.
     */
    public void setNext(final Node newNode) {
        next = newNode;
    }

    /**
     * Method to get value of Node.
     *
     * @return value, node value.
     */
    public T getValue() {
        return this.value;
    }
}
