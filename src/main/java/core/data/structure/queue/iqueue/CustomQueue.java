package core.data.structure.queue.iqueue;

import core.data.structure.linked.list.ilist.CustomList;
import core.data.structure.linked.list.ilist.IList;
import core.data.structure.linked.list.ilist.Node;

/**
 * Class CustomQueue.
 */
public class CustomQueue<T> implements IQueue<T> {
    private IList<T> customList;

    /**
     * CustomQueue constructor.
     */
    public CustomQueue() {
        this.customList = new CustomList<>();
    }

    @Override
    public void add(T value) {
        customList.addLast(value);
    }

    @Override
    public Node remove() {
        return customList.removeFirst();
    }

    @Override
    public Node peek() {
        return customList.getFirst();
    }
    @Override
    public String printQueue() {
        return customList.printList();
    }
}
