package core.data.structure.stack.istack;

import core.data.structure.linked.list.ilist.Node;

/**
 * Interface IQueue.
 */
public interface IStack<T> {

    /**
     * Pushes a value onto the top of this stack. This has exactly.
     *
     * @param value to add to Queue.
     */
    void push(T value);

    /**
     * Removes the object at the top of this stack and returns that.
     *
     * @return Node, the node deleted.
     */
    Node pop();

    /**
     * Looks at the object at the top of this stack without removing it from the stack.
     *
     * @return Node, the top node.
     */
    Node peek();

    /**
     * Method to print Stack.
     *
     * @return String value with all stack elements.
     */
    String printStack();
}
