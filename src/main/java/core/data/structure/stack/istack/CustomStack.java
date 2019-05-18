package core.data.structure.stack.istack;

import core.data.structure.linked.list.ilist.CustomList;
import core.data.structure.linked.list.ilist.IList;
import core.data.structure.linked.list.ilist.Node;

/**
 * Class CustomQueue.
 */
public class CustomStack<T> implements IStack<T> {
    private IList<T> customList;

    /**
     * CustomQueue constructor.
     */
    public CustomStack() {
        this.customList = new CustomList<>();
    }

    @Override
    public void push(T value) {
        customList.addFirst(value);
    }

    @Override
    public Node pop() {
        return customList.removeFirst();
    }

    @Override
    public Node peek() {
        return customList.getFirst();
    }
    @Override
    public String printStack() {
        return customList.printList();
    }
}
