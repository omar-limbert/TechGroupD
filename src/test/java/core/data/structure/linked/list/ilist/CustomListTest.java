package core.data.structure.linked.list.ilist;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;


/**
 * This class contains CustomList.java .
 */
public class CustomListTest {

    private IList<Integer> integerCustomList;
    private IList<String> stringCustomList;

    /**
     * This method initialize values.
     */
    @Before
    public void init() {

        integerCustomList = new CustomList<>();
        stringCustomList = new CustomList<>();
    }

    /**
     * UnitTest for test addFirst() method.
     */
    @Test
    public void testAddFirstMethod() {
        integerCustomList.addFirst(1);
        assertEquals("[1]-Node 1\n", integerCustomList.printList());
        integerCustomList.addFirst(2);
        assertEquals("[1]-Node 2\n[2]-Node 1\n", integerCustomList.printList());
        integerCustomList.addFirst(3);
        assertEquals("[1]-Node 3\n[2]-Node 2\n[3]-Node 1\n", integerCustomList.printList());
    }

    /**
     * UnitTest for test addFirst() method.
     */
    @Test
    public void testAddFirstStringMethod() {
        stringCustomList.addFirst("a");
        assertEquals("[1]-Node a\n", stringCustomList.printList());
        stringCustomList.addFirst("b");
        assertEquals("[1]-Node b\n[2]-Node a\n", stringCustomList.printList());
        stringCustomList.addFirst("c");
        assertEquals("[1]-Node c\n[2]-Node b\n[3]-Node a\n", stringCustomList.printList());
    }
    /**
     * UnitTest for test addLast() method.
     */
    @Test
    public void testAddLastMethod() {
        integerCustomList.addLast(1);
        assertEquals("[1]-Node 1\n", integerCustomList.printList());
        integerCustomList.addLast(2);
        assertEquals("[1]-Node 1\n[2]-Node 2\n", integerCustomList.printList());
        integerCustomList.addLast(3);
        assertEquals("[1]-Node 1\n[2]-Node 2\n[3]-Node 3\n", integerCustomList.printList());
    }

    /**
     * UnitTest for test addLast() method.
     */
    @Test
    public void testAddLastStringMethod() {
        stringCustomList.addLast("a");
        assertEquals("[1]-Node a\n", stringCustomList.printList());
        stringCustomList.addLast("b");
        assertEquals("[1]-Node a\n[2]-Node b\n", stringCustomList.printList());
        stringCustomList.addLast("c");
        assertEquals("[1]-Node a\n[2]-Node b\n[3]-Node c\n", stringCustomList.printList());
    }

    /**
     * UnitTest for test add() method.
     */
    @Test
    public void testAddMethod() {
        integerCustomList.addFirst(1);
        integerCustomList.addLast(2);
        integerCustomList.addLast(3);
        integerCustomList.add(0, 4);
        assertEquals("[1]-Node 4\n[2]-Node 1\n[3]-Node 2\n[4]-Node 3\n", integerCustomList.printList());
        integerCustomList.add(1, 5);
        assertEquals("[1]-Node 5\n[2]-Node 4\n[3]-Node 1\n[4]-Node 2\n[5]-Node 3\n", integerCustomList.printList());
        integerCustomList.add(8, 10);
        assertEquals("[1]-Node 5\n[2]-Node 4\n[3]-Node 1\n[4]-Node 2\n[5]-Node 3\n[6]-Node 10\n", integerCustomList.printList());
    }

    /**
     * UnitTest for test add() method.
     */
    @Test
    public void testAddStringMethod() {
        stringCustomList.addFirst("a");
        stringCustomList.addLast("b");
        stringCustomList.addLast("c");
        stringCustomList.add(0, "d");
        assertEquals("[1]-Node d\n[2]-Node a\n[3]-Node b\n[4]-Node c\n", stringCustomList.printList());
        stringCustomList.add(1, "e");
        assertEquals("[1]-Node e\n[2]-Node d\n[3]-Node a\n[4]-Node b\n[5]-Node c\n", stringCustomList.printList());
        stringCustomList.add(8, "f");
        assertEquals("[1]-Node e\n[2]-Node d\n[3]-Node a\n[4]-Node b\n[5]-Node c\n[6]-Node f\n", stringCustomList.printList());
    }

    /**
     * UnitTest for test removeFirst() method.
     */
    @Test
    public void testRemoveFirstMethod() {
        assertNull(integerCustomList.removeFirst());
        assertEquals("There are no nodes in the linked list", integerCustomList.printList());
        integerCustomList.addFirst(1);
        assertEquals(1, integerCustomList.removeFirst().getValue());
        assertEquals("There are no nodes in the linked list", integerCustomList.printList());
        integerCustomList.addFirst(2);
        integerCustomList.addFirst(3);
        integerCustomList.addFirst(4);
        integerCustomList.addFirst(5);
        assertEquals(5, integerCustomList.removeFirst().getValue());
        assertEquals("[1]-Node 4\n[2]-Node 3\n[3]-Node 2\n", integerCustomList.printList());
    }

    /**
     * UnitTest for test removeFirst() method.
     */
    @Test
    public void testRemoveFirstStringMethod() {
        assertNull(stringCustomList.removeFirst());
        assertEquals("There are no nodes in the linked list", stringCustomList.printList());
        stringCustomList.addFirst("a");
        assertEquals("a", stringCustomList.removeFirst().getValue());
        assertEquals("There are no nodes in the linked list", stringCustomList.printList());
        stringCustomList.addFirst("b");
        stringCustomList.addFirst("c");
        stringCustomList.addFirst("d");
        stringCustomList.addFirst("e");
        assertEquals("e", stringCustomList.removeFirst().getValue());
        assertEquals("[1]-Node d\n[2]-Node c\n[3]-Node b\n", stringCustomList.printList());
    }

    /**
     * UnitTest for test removeLast() method.
     */
    @Test
    public void testRemoveLastMethod() {
        assertNull(integerCustomList.removeLast());
        assertEquals("There are no nodes in the linked list", integerCustomList.printList());
        integerCustomList.addLast(1);
        assertEquals(1, integerCustomList.removeLast().getValue());
        assertEquals("There are no nodes in the linked list", integerCustomList.printList());
        integerCustomList.addLast(2);
        integerCustomList.addLast(3);
        integerCustomList.addLast(4);
        integerCustomList.addLast(5);
        assertEquals(5, integerCustomList.removeLast().getValue());
        assertEquals("[1]-Node 2\n[2]-Node 3\n[3]-Node 4\n", integerCustomList.printList());
    }

    /**
     * UnitTest for test removeLast() method.
     */
    @Test
    public void testRemoveLastStringMethod() {
        assertNull(stringCustomList.removeLast());
        assertEquals("There are no nodes in the linked list", stringCustomList.printList());
        stringCustomList.addLast("a");
        assertEquals("a", stringCustomList.removeLast().getValue());
        assertEquals("There are no nodes in the linked list", stringCustomList.printList());
        stringCustomList.addLast("b");
        stringCustomList.addLast("c");
        stringCustomList.addLast("d");
        stringCustomList.addLast("e");
        assertEquals("e", stringCustomList.removeLast().getValue());
        assertEquals("[1]-Node b\n[2]-Node c\n[3]-Node d\n", stringCustomList.printList());
    }

    /**
     * UnitTest for test remove() method.
     */
    @Test
    public void testRemoveMethod() {
        assertNull(integerCustomList.remove(1));
        assertEquals("There are no nodes in the linked list", integerCustomList.printList());
        integerCustomList.addLast(1);
        integerCustomList.addFirst(2);
        integerCustomList.addLast(3);
        integerCustomList.addFirst(4);
        integerCustomList.addLast(5);
        assertEquals(1, integerCustomList.remove(3).getValue());
        assertEquals("[1]-Node 4\n[2]-Node 2\n[3]-Node 3\n[4]-Node 5\n", integerCustomList.printList());
    }

    /**
     * UnitTest for test remove() method.
     */
    @Test
    public void testRemoveStringMethod() {
        assertNull(stringCustomList.remove(1));
        assertEquals("There are no nodes in the linked list", stringCustomList.printList());
        stringCustomList.addLast("a");
        stringCustomList.addFirst("b");
        stringCustomList.addLast("c");
        stringCustomList.addFirst("d");
        stringCustomList.addLast("e");
        assertEquals("a", stringCustomList.remove(3).getValue());
        assertEquals("[1]-Node d\n[2]-Node b\n[3]-Node c\n[4]-Node e\n", stringCustomList.printList());
    }

    /**
     * UnitTest for test print() method..
     */
    @Test
    public void testPrintMethod() {
        assertEquals(integerCustomList.printList(), "There are no nodes in the linked list");
        integerCustomList.addLast(1);
        assertEquals(integerCustomList.printList(), "[1]-Node 1\n");
        integerCustomList.addLast(2);
        assertEquals(integerCustomList.printList(), "[1]-Node 1\n[2]-Node 2\n");
        integerCustomList.addLast(3);
        assertEquals(integerCustomList.printList(), "[1]-Node 1\n[2]-Node 2\n[3]-Node 3\n");
    }

    /**
     * UnitTest for test print() method..
     */
    @Test
    public void testPrintStringMethod() {
        assertEquals(stringCustomList.printList(), "There are no nodes in the linked list");
        stringCustomList.addLast("a");
        assertEquals(stringCustomList.printList(), "[1]-Node a\n");
        stringCustomList.addLast("b");
        assertEquals(stringCustomList.printList(), "[1]-Node a\n[2]-Node b\n");
        stringCustomList.addLast("c");
        assertEquals(stringCustomList.printList(), "[1]-Node a\n[2]-Node b\n[3]-Node c\n");
    }

    /**
     * UnitTest for test getFirst() method..
     */
    @Test
    public void testGetFirstStringMethod() {
        assertEquals( null,stringCustomList.getFirst());
        stringCustomList.addLast("a");
        assertEquals( "a",stringCustomList.getFirst().getValue());
        stringCustomList.addLast("b");
        stringCustomList.addFirst("c");
        assertEquals("c", stringCustomList.getFirst().getValue());
    }

    /**
     * UnitTest for test getFirst() method..
     */
    @Test
    public void testGetFirstIntegerMethod() {
        assertEquals( null,integerCustomList.getFirst());
        integerCustomList.addLast(1);
        assertEquals( 1,integerCustomList.getFirst().getValue());
        integerCustomList.addLast(2);
        integerCustomList.addFirst(3);
        assertEquals(3, integerCustomList.getFirst().getValue());
    }

    /**
     * UnitTest for test getLast() method..
     */
    @Test
    public void testGetLastStringMethod() {
        assertEquals( null,stringCustomList.getLast());
        stringCustomList.addLast("a");
        assertEquals( "a",stringCustomList.getLast().getValue());
        stringCustomList.addLast("b");
        stringCustomList.addFirst("c");
        assertEquals("b", stringCustomList.getLast().getValue());
    }

    /**
     * UnitTest for test getLast() method..
     */
    @Test
    public void testGetLastIntegerMethod() {
        assertEquals( null,integerCustomList.getLast());
        integerCustomList.addLast(1);
        assertEquals( 1,integerCustomList.getLast().getValue());
        integerCustomList.addLast(2);
        integerCustomList.addFirst(3);
        assertEquals(2, integerCustomList.getLast().getValue());
    }
}
