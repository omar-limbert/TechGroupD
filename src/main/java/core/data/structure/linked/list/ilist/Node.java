package core.data.structure.linked.list.ilist;

/**
 * Class Node.
 */
public class Node<T extends Comparable<T>> {
    private final T value;
    private Node<T> next;
    private Node<T> previous;

    /**
     * Node Constructor.
     *
     * @param value Node value.
     */
    public Node(T value) {
        this.value = value;
        this.next = null;
        this.previous = null;
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
     * Method to get previous Node.
     *
     * @return previous, previous Node.
     */
    public Node<T> getPrevious() {
        return previous;
    }

    /**
     * Method to set next Node.
     *
     * @param newNode new Node.
     */
    public void setNext(Node<T> newNode) {
        next = newNode;
    }

    /**
     * Method to set previous Node.
     *
     * @param newNode new Node.
     */
    public void setPrevious(Node<T> newNode) {
        previous = newNode;
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
