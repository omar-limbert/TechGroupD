package core.data.structure.tree.itree;

import core.data.structure.linked.list.ilist.Node;

/**
 * Class CustomTree.
 */
public class CustomTree<T extends Comparable<T>> implements ITree<T> {
    private Node<T> root;

    /**
     * CustomTree constructor.
     */
    public CustomTree() {
        this.root = null;
    }

    @Override
    public void add(T value) {
        Node<T> newNode = new Node<>(value);
        Node<T> current = root;
        this.addNode(newNode, current);
    }

    /**
     * Method to add Generic Node to Tree.
     *
     * @param newNode new Node to add.
     * @param current current node.
     */
    private void addNode(Node<T> newNode, Node<T> current) {
        if (current == null) {
            this.root = newNode;
        } else {
            if (newNode.getValue().compareTo(current.getValue()) < 0) {
                this.insertToLeft(newNode, current);
            } else {
                this.insertRight(newNode, current);
            }
        }
    }

    /**
     * Method to insert into right of Tree.
     *
     * @param newNode new Node to add.
     * @param current current node.
     */
    private void insertRight(Node<T> newNode, Node<T> current) {
        if (current.getNext() == null) {
            current.setNext(newNode);
        } else {
            this.addNode(newNode, current.getNext());
        }
    }

    /**
     * Method to insert into left of Tree.
     *
     * @param newNode new Node to add.
     * @param current current node.
     */
    private void insertToLeft(Node<T> newNode, Node<T> current) {
        if (current.getPrevious() == null) {
            current.setPrevious(newNode);
        } else {
            this.addNode(newNode, current.getPrevious());
        }
    }

    @Override
    public String print() {
        Node<T> current = root;
        StringBuilder result = new StringBuilder();
        print("", current, false, result);
        return result.toString();
    }

    /**
     * Method to print Tree.
     *
     * @param prefix        .
     * @param current       .
     * @param isLeft        .
     * @param stringBuilder .
     */
    private void print(String prefix, Node<T> current, boolean isLeft, StringBuilder stringBuilder) {
        if (current != null) {
            stringBuilder.append(prefix)
                    .append(isLeft ? "|-- " : "\\-- ")
                    .append(current.getValue())
                    .append("\n");
            print(prefix + (isLeft ? "|   " : "    "), current.getPrevious(), true, stringBuilder);
            print(prefix + (isLeft ? "|   " : "    "), current.getNext(), false, stringBuilder);
        }
    }
}
