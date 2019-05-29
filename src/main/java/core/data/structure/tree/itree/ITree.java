package core.data.structure.tree.itree;

/**
 * Interface IQueue.
 */
public interface ITree<T> {

    /**
     * Pushes a value onto the tree.
     *
     * @param value to add to Tree.
     */
    void add(T value);

    /**
     * Method to print Tree.
     *
     * @return String value with all Tree elements.
     */
    String print();
}
