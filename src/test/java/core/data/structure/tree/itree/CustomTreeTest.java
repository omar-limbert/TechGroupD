package core.data.structure.tree.itree;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * This class contains CustomTree.java .
 */
public class CustomTreeTest {

    private ITree<Integer> integerCustomTree;
    private ITree<String> stringCustomTree;

    /**
     * This method initialize values.
     */
    @Before
    public void init() {

        integerCustomTree = new CustomTree<>();
        stringCustomTree = new CustomTree<>();
    }

    /**
     * UnitTest for test add() method.
     */
    @Test
    public void testAddIntegerValuesToTree() {
        integerCustomTree.add(60);
        integerCustomTree.add(40);
        integerCustomTree.add(80);
        integerCustomTree.add(30);
        integerCustomTree.add(50);
        integerCustomTree.add(70);
        integerCustomTree.add(90);
        assertEquals("\\-- 60\n" +
                              "    |-- 40\n" +
                              "    |   |-- 30\n" +
                              "    |   \\-- 50\n" +
                              "    \\-- 80\n" +
                              "        |-- 70\n" +
                              "        \\-- 90\n", integerCustomTree.print());
    }

    /**
     * UnitTest for test add() method.
     */
    @Test
    public void testAddStringValuesToTree() {
        stringCustomTree.add("g");
        stringCustomTree.add("b");
        stringCustomTree.add("h");
        stringCustomTree.add("c");
        stringCustomTree.add("i");
        assertEquals("\\-- g\n" +
                              "    |-- b\n" +
                              "    |   \\-- c\n" +
                              "    \\-- h\n" +
                              "        \\-- i\n", stringCustomTree.print());
    }

}
