package core.data.structure.queue.iqueue;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * This class contains CustomQueue.java .
 */
public class CustomQueueTest {

    private IQueue<Integer> integerCustomQueue;
    private IQueue<String> stringCustomQueue;

    /**
     * This method initialize values.
     */
    @Before
    public void init() {

        integerCustomQueue = new CustomQueue<>();
        stringCustomQueue = new CustomQueue<>();
    }

    /**
     * UnitTest for test add() method.
     */
    @Test
    public void testAddIntegerValues() {
        integerCustomQueue.add(1);
        System.out.println(integerCustomQueue.printQueue());
        assertEquals("[1]-Node 1\n", integerCustomQueue.printQueue());
        integerCustomQueue.add(2);
        System.out.println(integerCustomQueue.printQueue());
        assertEquals("[1]-Node 1\n[2]-Node 2\n", integerCustomQueue.printQueue());
        integerCustomQueue.add(3);
        System.out.println(integerCustomQueue.printQueue());
        assertEquals("[1]-Node 1\n[2]-Node 2\n[3]-Node 3\n", integerCustomQueue.printQueue());
    }

    /**
     * UnitTest for test add() method.
     */
    @Test
    public void testAddStringValues() {
        stringCustomQueue.add("a");
        assertEquals("[1]-Node a\n", stringCustomQueue.printQueue());
        stringCustomQueue.add("b");
        assertEquals("[1]-Node a\n[2]-Node b\n", stringCustomQueue.printQueue());
        stringCustomQueue.add("c");
        assertEquals("[1]-Node a\n[2]-Node b\n[3]-Node c\n", stringCustomQueue.printQueue());
    }

    /**
     * UnitTest for test remove() method.
     */
    @Test
    public void testRemoveFromIntegerQueue() {
        integerCustomQueue.add(1);
        integerCustomQueue.add(2);
        integerCustomQueue.add(3);
        integerCustomQueue.add(4);
        integerCustomQueue.add(5);
        assertEquals(1,integerCustomQueue.remove().getValue());
        assertEquals("[1]-Node 2\n[2]-Node 3\n[3]-Node 4\n[4]-Node 5\n", integerCustomQueue.printQueue());

    }

    /**
     * UnitTest for test remove() method.
     */
    @Test
    public void testRemoveFromStringQueue() {
        stringCustomQueue.add("a");
        stringCustomQueue.add("b");
        stringCustomQueue.add("c");
        stringCustomQueue.add("d");
        stringCustomQueue.add("e");
        assertEquals("a",stringCustomQueue.remove().getValue());
        assertEquals("[1]-Node b\n[2]-Node c\n[3]-Node d\n[4]-Node e\n", stringCustomQueue.printQueue());
    }

    /**
     * UnitTest for test peek() method.
     */
    @Test
    public void testPeekFromIntegerQueue() {
        integerCustomQueue.add(1);
        integerCustomQueue.add(2);
        integerCustomQueue.add(3);
        integerCustomQueue.add(4);
        integerCustomQueue.add(5);
        assertEquals(1,integerCustomQueue.peek().getValue());
        assertEquals("[1]-Node 1\n[2]-Node 2\n[3]-Node 3\n[4]-Node 4\n[5]-Node 5\n", integerCustomQueue.printQueue());
    }

    /**
     * UnitTest for test peek() method.
     */
    @Test
    public void testPeekFromStringQueue() {
        stringCustomQueue.add("a");
        stringCustomQueue.add("b");
        stringCustomQueue.add("c");
        stringCustomQueue.add("d");
        stringCustomQueue.add("e");
        assertEquals("a",stringCustomQueue.peek().getValue());
        assertEquals("[1]-Node a\n[2]-Node b\n[3]-Node c\n[4]-Node d\n[5]-Node e\n", stringCustomQueue.printQueue());
    }
    /**
     * UnitTest for test printQueue() method.
     */
    @Test
    public void testPrintIntegerQueue() {
        integerCustomQueue.add(1);
        integerCustomQueue.add(2);
        integerCustomQueue.add(3);
        integerCustomQueue.add(4);
        integerCustomQueue.add(5);
        assertEquals("[1]-Node 1\n[2]-Node 2\n[3]-Node 3\n[4]-Node 4\n[5]-Node 5\n", integerCustomQueue.printQueue());
    }

    /**
     * UnitTest for test printQueue() method.
     */
    @Test
    public void testPrintFromStringQueue() {
        stringCustomQueue.add("a");
        stringCustomQueue.add("b");
        stringCustomQueue.add("c");
        stringCustomQueue.add("d");
        stringCustomQueue.add("e");
        assertEquals("[1]-Node a\n[2]-Node b\n[3]-Node c\n[4]-Node d\n[5]-Node e\n", stringCustomQueue.printQueue());
    }
}
