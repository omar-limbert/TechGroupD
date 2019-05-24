package homeworks.homework1;

import homeworks.homework1.LinkedListUtils;
import org.junit.Test;

import java.util.Arrays;
import java.util.LinkedList;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

/**
 * This class contains CustomList.java .
 */
public class LinkedListUtilsTest {

    /**
     * UnitTest for test addFirst() method.
     */
    @Test
    public void testInsertSortedMethod() {
        LinkedList<Integer> customList = new LinkedList<>();
        LinkedListUtils.insertSorted(customList, 1);
        assertEquals("[1]", customList.toString());
        customList = new LinkedList<>(Arrays.asList(1, 4, 6, 9, 20));
        LinkedListUtils.insertSorted(customList, 10);
        assertEquals("[1, 4, 6, 9, 10, 20]", customList.toString());
        LinkedListUtils.insertSorted(customList, 2);
        assertEquals("[1, 2, 4, 6, 9, 10, 20]", customList.toString());
        LinkedListUtils.insertSorted(customList, 3);
        assertEquals("[1, 2, 3, 4, 6, 9, 10, 20]", customList.toString());
        LinkedListUtils.insertSorted(customList, 5);
        assertEquals("[1, 2, 3, 4, 5, 6, 9, 10, 20]", customList.toString());
    }

    /**
     * UnitTest for test removeMaximumValues() method.
     */
    @Test
    public void testRemoveMaximumValuesMethod() {
        LinkedList<String> customList = new LinkedList<>();
        LinkedListUtils.removeMaximumValues(customList, 1);
        assertEquals("[]", customList.toString());
        customList = new LinkedList<>(Arrays.asList("z", "f", "r", "a", "b"));
        LinkedListUtils.removeMaximumValues(customList, 0);
        assertEquals("[z, f, r, a, b]", customList.toString());
        LinkedListUtils.removeMaximumValues(customList, 2);
        assertEquals("[f, a, b]", customList.toString());
        customList = new LinkedList<>(Arrays.asList("a", "a", "b", "b", "c"));
        LinkedListUtils.removeMaximumValues(customList, 2);
        assertEquals("[a, a]", customList.toString());
    }

    /**
     * UnitTest for test containsSubsequence() method.
     */
    @Test
    public void testContainsSubsequenceMethod() {
        LinkedList<Integer> emptyLinkedList = new LinkedList<>();
        LinkedList<Integer> customList1 = new LinkedList<>(Arrays.asList(1, 2, 3, 4, 5, 10, 100));
        LinkedList<Integer> customList2 = new LinkedList<>(Arrays.asList(3, 4));
        LinkedList<Integer> customList3 = new LinkedList<>(Arrays.asList(10, 100));
        assertTrue(LinkedListUtils.containsSubsequence(customList1, customList2));
        assertTrue(LinkedListUtils.containsSubsequence(customList1, customList3));
        assertFalse(LinkedListUtils.containsSubsequence(emptyLinkedList, emptyLinkedList));
        assertFalse(LinkedListUtils.containsSubsequence(emptyLinkedList, customList1));
        assertFalse(LinkedListUtils.containsSubsequence(customList2, customList1));
        assertFalse(LinkedListUtils.containsSubsequence(customList2, customList1));
        assertFalse(LinkedListUtils.containsSubsequence(customList3, customList2));
        assertFalse(LinkedListUtils.containsSubsequence(customList2, customList1));
    }
}
