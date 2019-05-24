package core.data.structure.stack.istack;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * This class contains CustomQueue.java .
 */
public class CustomStackTest {

    private IStack<Integer> integerCustomStack;
    private IStack<String> stringCustomStack;

    /**
     * This method initialize values.
     */
    @Before
    public void init() {

        integerCustomStack = new CustomStack<>();
        stringCustomStack = new CustomStack<>();
    }

    /**
     * UnitTest for test add() method.
     */
    @Test
    public void testPushIntegerValuesToStack() {
        integerCustomStack.push(1);
        assertEquals("[1]-Node 1\n", integerCustomStack.printStack());
        integerCustomStack.push(2);
        assertEquals("[1]-Node 2\n[2]-Node 1\n", integerCustomStack.printStack());
        integerCustomStack.push(3);
        assertEquals("[1]-Node 3\n[2]-Node 2\n[3]-Node 1\n", integerCustomStack.printStack());
    }

    /**
     * UnitTest for test add() method.
     */
    @Test
    public void testPushStringValuesToStack() {
        stringCustomStack.push("a");
        assertEquals("[1]-Node a\n", stringCustomStack.printStack());
        stringCustomStack.push("b");
        assertEquals("[1]-Node b\n[2]-Node a\n", stringCustomStack.printStack());
        stringCustomStack.push("c");
        assertEquals("[1]-Node c\n[2]-Node b\n[3]-Node a\n", stringCustomStack.printStack());
    }

    /**
     * UnitTest for test remove() method.
     */
    @Test
    public void testPopFromIntegerStack() {
        integerCustomStack.push(1);
        integerCustomStack.push(2);
        integerCustomStack.push(3);
        integerCustomStack.push(4);
        integerCustomStack.push(5);
        assertEquals(5, integerCustomStack.pop().getValue());
        assertEquals("[1]-Node 4\n[2]-Node 3\n[3]-Node 2\n[4]-Node 1\n", integerCustomStack.printStack());

    }

    /**
     * UnitTest for test remove() method.
     */
    @Test
    public void testPopFromStringStack() {
        stringCustomStack.push("a");
        stringCustomStack.push("b");
        stringCustomStack.push("c");
        stringCustomStack.push("d");
        stringCustomStack.push("e");
        assertEquals("e", stringCustomStack.pop().getValue());
        assertEquals("[1]-Node d\n[2]-Node c\n[3]-Node b\n[4]-Node a\n", stringCustomStack.printStack());
    }

    /**
     * UnitTest for test peek() method.
     */
    @Test
    public void testPeekFromIntegerStack() {
        integerCustomStack.push(1);
        integerCustomStack.push(2);
        integerCustomStack.push(3);
        integerCustomStack.push(4);
        integerCustomStack.push(5);
        assertEquals(5, integerCustomStack.peek().getValue());
        assertEquals("[1]-Node 5\n[2]-Node 4\n[3]-Node 3\n[4]-Node 2\n[5]-Node 1\n", integerCustomStack.printStack());
    }

    /**
     * UnitTest for test peek() method.
     */
    @Test
    public void testPeekFromStringStack() {
        stringCustomStack.push("a");
        stringCustomStack.push("b");
        stringCustomStack.push("c");
        stringCustomStack.push("d");
        stringCustomStack.push("e");
        assertEquals("e", stringCustomStack.peek().getValue());
        assertEquals("[1]-Node e\n[2]-Node d\n[3]-Node c\n[4]-Node b\n[5]-Node a\n", stringCustomStack.printStack());
    }
    /**
     * UnitTest for test printQueue() method.
     */
    @Test
    public void testPrintIntegerQueue() {
        integerCustomStack.push(1);
        integerCustomStack.push(2);
        integerCustomStack.push(3);
        integerCustomStack.push(4);
        integerCustomStack.push(5);
        assertEquals("[1]-Node 5\n[2]-Node 4\n[3]-Node 3\n[4]-Node 2\n[5]-Node 1\n", integerCustomStack.printStack());
    }

    /**
     * UnitTest for test printQueue() method.
     */
    @Test
    public void testPrintFromStringQueue() {
        stringCustomStack.push("a");
        stringCustomStack.push("b");
        stringCustomStack.push("c");
        stringCustomStack.push("d");
        stringCustomStack.push("e");
        assertEquals("[1]-Node e\n[2]-Node d\n[3]-Node c\n[4]-Node b\n[5]-Node a\n", stringCustomStack.printStack());
    }
}
