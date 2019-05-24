package core.data.structure.linked.list.ilist;

/**
 * Interface IList.
 */
public interface IList<T> {

    /**
     * Method to add value at the beginning of linked list.
     *
     * @param value to add to linked list.
     */
    void addFirst(T value);

    /**
     * Method to add value at the end of linked list.
     *
     * @param value to add to linked list.
     */
    void addLast(T value);

    /**
     * Method to add value at index.
     *
     * @param index to add element..
     * @param value to add to linked list.
     */
    void add(int index, T value);

    /**
     * Method to remove first element from linked list.
     *
     * @return Node, the node deleted.
     */
    Node removeFirst();

    /**
     * Method to remove last element from linked list.
     *
     * @return Node, the node deleted.
     */
    Node removeLast();

    /**
     * Method to remove value at index.
     *
     * @param index to remove element..
     * @return Node, the node deleted.
     */
    Node remove(int index);

    /**
     * Method to get the first node.
     *
     * @return Node, element.
     */
    Node getFirst();

    /**
     * Method to get the last node.
     *
     * @return Node, element.
     */
    Node getLast();

    /**
     * Method to print Linked List.
     *
     * @return String value with all linked list elements.
     */
    String printList();
}
