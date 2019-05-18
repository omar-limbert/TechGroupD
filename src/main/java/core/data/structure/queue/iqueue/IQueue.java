package core.data.structure.queue.iqueue;

import core.data.structure.linked.list.ilist.Node;

/**
 * Interface IQueue.
 */
public interface IQueue<T> {

    /**
     * Method to add value at the end of Queue.
     *
     * @param value to add to Queue.
     */
    void add(T value);

    /**
     * Retrieves and removes the head of this queue.
     *
     * @return Node, the node deleted.
     */
    Node remove();

    /**
     * Retrieves, but does not remove, the head of this queue.
     *
     * @return Node, the head node.
     */
    Node peek();

    /**
     * Method to print Queue.
     *
     * @return String value with all linked list elements.
     */
    String printQueue();
}
