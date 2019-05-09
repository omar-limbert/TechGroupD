package core.data.structure.linked.list.ilist;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;


/**
 * This class contains CustomList.java .
 */
public class CustomListTest {

    private IList customList;

    /**
     * This method initialize values.
     */
    @Before
    public void init() {

        customList = new CustomList();
    }

    /**
     * UnitTest for test addFirst() method.
     */
    @Test
    public void testAddFirstMethod() {
        customList.addFirst(1);
        assertEquals("[1]-Node 1\n", customList.printList());
        customList.addFirst(2);
        assertEquals("[1]-Node 2\n[2]-Node 1\n", customList.printList());
        customList.addFirst(3);
        assertEquals("[1]-Node 3\n[2]-Node 2\n[3]-Node 1\n", customList.printList());
    }

    /**
     * UnitTest for test addLast() method.
     */
    @Test
    public void testAddLastMethod() {
        customList.addLast(1);
        assertEquals("[1]-Node 1\n", customList.printList());
        customList.addLast(2);
        assertEquals("[1]-Node 1\n[2]-Node 2\n", customList.printList());
        customList.addLast(3);
        assertEquals("[1]-Node 1\n[2]-Node 2\n[3]-Node 3\n", customList.printList());
    }

    /**
     * UnitTest for test add() method.
     */
    @Test
    public void testAddMethod() {
        customList.addFirst(1);
        customList.addLast(2);
        customList.addLast(3);
        customList.add(0, 4);
        assertEquals("[1]-Node 4\n[2]-Node 1\n[3]-Node 2\n[4]-Node 3\n", customList.printList());
        customList.add(1, 5);
        assertEquals("[1]-Node 5\n[2]-Node 4\n[3]-Node 1\n[4]-Node 2\n[5]-Node 3\n", customList.printList());
        customList.add(8, 10);
        assertEquals("[1]-Node 5\n[2]-Node 4\n[3]-Node 1\n[4]-Node 2\n[5]-Node 3\n[6]-Node 10\n", customList.printList());
    }

    /**
     * UnitTest for test removeFirst() method.
     */
    @Test
    public void testRemoveFirstMethod() {
        assertNull(customList.removeFirst());
        assertEquals("There are no nodes in the linked list", customList.printList());
        customList.addFirst(1);
        assertEquals(1, customList.removeFirst().getValue());
        assertEquals("There are no nodes in the linked list", customList.printList());
        customList.addFirst(2);
        customList.addFirst(3);
        customList.addFirst(4);
        customList.addFirst(5);
        assertEquals(5, customList.removeFirst().getValue());
        assertEquals("[1]-Node 4\n[2]-Node 3\n[3]-Node 2\n", customList.printList());
    }

    /**
     * UnitTest for test removeLast() method.
     */
    @Test
    public void testRemoveLastMethod() {
        assertNull(customList.removeLast());
        assertEquals("There are no nodes in the linked list", customList.printList());
        customList.addLast(1);
        assertEquals(1, customList.removeFirst().getValue());
        assertEquals("There are no nodes in the linked list", customList.printList());
        customList.addLast(2);
        customList.addLast(3);
        customList.addLast(4);
        customList.addLast(5);
        System.out.println(customList.printList());
        assertEquals(5, customList.removeLast().getValue());
        assertEquals("[1]-Node 2\n[2]-Node 3\n[3]-Node 4\n", customList.printList());
    }

    /**
     * UnitTest for test remove() method.
     */
    @Test
    public void testRemoveMethod() {
        assertNull(customList.remove(1));
        assertEquals("There are no nodes in the linked list", customList.printList());
        customList.addLast(1);
        customList.addFirst(2);
        customList.addLast(3);
        customList.addFirst(4);
        customList.addLast(5);
        assertEquals(1, customList.remove(3).getValue());
        assertEquals("[1]-Node 4\n[2]-Node 2\n[3]-Node 3\n[4]-Node 5\n", customList.printList());
    }

    /**
     * UnitTest for test print() method..
     */
    @Test
    public void testPrintMethod() {
        System.out.println(customList.printList());
        assertEquals(customList.printList(), "There are no nodes in the linked list");
        customList.addLast(1);
        assertEquals(customList.printList(), "[1]-Node 1\n");
        customList.addLast(2);
        assertEquals(customList.printList(), "[1]-Node 1\n[2]-Node 2\n");
        customList.addLast(3);
        assertEquals(customList.printList(), "[1]-Node 1\n[2]-Node 2\n[3]-Node 3\n");
    }
}
