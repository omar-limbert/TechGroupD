package core.data.structure.linked.list.ilist;

/**
 * Class Node.
 */
public class Node {
    private int value;
    private Node next;

    /**
     * Node Constructor.
     *
     * @param value Node value.
     */
    public Node(int value) {
        this.value = value;
        this.next = null;
    }

    /**
     * Node Constructor.
     */
    public Node() {
        this.value = 0;
        this.next = null;
    }

    /**
     * Method to get next Node.
     *
     * @return next, next Node.
     */
    public Node getNext() {
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
    public int getValue() {
        return this.value;
    }
}
