package core.data.structure.linked.list.homework1;
/*
 * SD2x Homework #1
 * Implement the methods below according to the specification in the assignment description.
 * Please be sure not to change the signature of any of the methods!
 */

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

public class LinkedListUtils {

    /*
     * This method assumes the input LinkedList is already sorted in non-descending
     * order (i.e.,such that each element is greater than or equal to the one that is before it,
     * and inserts the input int value into the correct location of the list.
     * Note that the method does not return anything, but rather modifies the input
     * LinkedList as a side effect. If the input LinkedList is null, this method should simply terminate.
     */
    public static void insertSorted(LinkedList<Integer> list, int value) {
        if (list != null) {
            if (list.isEmpty()) {
                list.add(value);
            } else {
                for (int index = 0; index < list.size(); index++) {
                    if (list.get(index) >= value) {
                        list.add(index, value);
                        break;
                    }
                    if (index == list.size() - 1) {
                        list.add(value);
                        break;
                    }
                }
            }
        }
    }

    /*
     * This method removes all instances of the N largest values in the LinkedList.
     * Because the values are Strings, you will need to use the String class’
     * compareTo method to find the largest elements; see the Java API for help with that method.
     * If the input LinkedList is null or if N is non-positive, this method should simply return
     * without any modifications to the input LinkedList. Keep in mind that if any of the Nlargest
     * values appear more than once in the LinkedList, this method should return remove all instances,
     * so it may remove more than N elements overall. The other elements in the LinkedList
     * should not be modified and their order must not be changed.
     */
    public static void removeMaximumValues(LinkedList<String> list, int N) {
        if (list != null && !list.isEmpty()) {
            if (list.size() <= N) {
                list.removeAll(list);
                return;
            }
            for (int index = 0; index < N; index++) {
                LinkedList<String> sortedList = new LinkedList<>(list);
                Collections.sort(sortedList, Collections.reverseOrder());
                list.removeAll(Arrays.asList(sortedList.get(0)));
            }
        }
    }

    /*
     * This method determines whether any part of the first LinkedList contains all elements of the second
     * in the same order with no other elements in the sequence, i.e. it should return true if
     * the second LinkedList is a subsequence of the first, and false if it is not.
     * The method should return false if either input is null or empty.
     */
    public static boolean containsSubsequence(LinkedList<Integer> one, LinkedList<Integer> two) {
        boolean result = false;
        if (one == null || two == null || one.isEmpty() || two.isEmpty()) {
            return result;
        }
        for (int index = 0; index <= one.size() - two.size(); index++) {
            result = true;
            for (int j = 0; j < two.size(); j++) {
                if (!one.get(index + j).equals(two.get(j))) {
                    result = false;
                    break;
                }
            }
            if (result) {
                return true;
            }
        }

        return false;
    }
}
