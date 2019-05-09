package core.data.structure.linked.list.ilist;

import java.util.stream.IntStream;

/**
 * Class CustomList.
 */
public class CustomList<T> implements IList<T> {
    private Node<T> head;
    private Node<T> tail;
    private int size;

    /**
     * CustomList constructor.
     */
    public CustomList() {
        this.head = null;
        this.size = 0;
    }

    @Override
    public void addFirst(T value) {
        Node<T> newNode = new Node<>(value);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.setNext(head);
            head = newNode;
        }
        size++;
    }

    @Override
    public void addLast(T value) {
        Node<T> newNode = new Node<>(value);
        if (tail == null) {
            tail = newNode;
            head = newNode;
        } else {
            tail.setNext(newNode);
            tail = newNode;
        }
        size++;
    }

    @Override
    public void add(int index, T value) {
        if (index <= 1 || index >= size) {
            this.addFirstOrLast(index, value);
        } else {
            this.addBetweenFirstAndLast(index, value);
        }
    }

    /**
     * Method to add element to first or last position.
     * @param index position to add.
     * @param value value to add.
     */
    private void addFirstOrLast(int index, T value) {
        if (index > size) {
            this.addLast(value);
        } else {
            this.addFirst(value);
        }
    }

    /**
     * Method to add element between fist and last position.
     * @param index position to add.
     * @param value value to add.
     */
    private void addBetweenFirstAndLast(int index, T value) {
        Node current = head;
        for (int i = 1; i < index - 1; i++) {
            current = current.getNext();
        }
        Node<T> newNode = new Node<>(value);
        newNode.setNext(current.getNext());
        current.setNext(newNode);
        size++;
    }


    @Override
    public String printList() {
        final Node[] current = {head};
        StringBuilder result = new StringBuilder();
        IntStream.range(0, size).forEach(index -> {
            result.append("[" + (index + 1) + "]-Node " + current[0].getValue() + "\n");
            current[0] = current[0].getNext();
        });
        return !result.toString().isEmpty() ? result.toString() : "There are no nodes in the linked list";
    }

    @Override
    public Node<T> removeFirst() {
        Node<T> current = head;
        if (head == tail) {
            head = tail = null;
            size = 0;
            return current;
        } else {
            if (head != null) {
                head = head.getNext();
                size--;
                return current;
            }
        }
        return null;
    }

    @Override
    public Node<T> removeLast() {
        Node<T> current = tail;
        if (head == tail) {
            head = tail = null;
            size = 0;
            return current;
        } else if (tail != null) {
            current = head;
            while (current.getNext().getNext() != null) {
                current = current.getNext();
            }
            Node<T> deletedNode = tail;
            tail = current;
            tail.setNext(null);
            size--;
            return deletedNode;
        }
        return null;
    }

    @Override
    public Node<T> remove(int index) {
        Node<T> current = head;
        Node<T> previousNode = current;
        if (head == tail) {
            head = tail = null;
            size = 0;
            return current;
        } else if (index <= size && head != null) {
            for (int i = 1; i < index; i++) {
                previousNode = current;
                current = current.getNext();
            }
            previousNode.setNext(current.getNext());
            this.size--;
            return current;
        }
        return null;
    }
}
