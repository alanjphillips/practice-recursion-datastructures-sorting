package linkedlist;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by alan on 26/09/15.
 */
public class LinkedListTest {

    @Test
    public void shouldCreateNode() {
        LinkedList.Node<String> node = new LinkedList.Node<>("TestElement", null);

        assertEquals("TestElement", node.getElement());
        assertNull(node.getNext());
    }

    @Test
    public void shouldCreateLinkedList() {
        LinkedList<String> linkedList = new LinkedList<>();

        assertNotNull(linkedList);
    }

    @Test
    public void shouldAddFirstToLinkedList() {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.addFirst("Test1");

        assertEquals(1, linkedList.getSize());
    }

    @Test
    public void shouldAddFirstToLinkedListTwice() {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.addFirst("Test1");
        linkedList.addFirst("Test2");

        assertEquals(2, linkedList.getSize());
    }

    @Test
    public void shouldAddLastToLinkedList() {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.addLast("Test1");

        assertEquals(1, linkedList.getSize());
    }

    @Test
    public void shouldAddLastToLinkedListTwice() {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.addLast("Test1");
        linkedList.addLast("Test2");

        assertEquals(2, linkedList.getSize());
        assertEquals("Test1", linkedList.getFirst());
        assertEquals("Test2", linkedList.getLast());
    }

    @Test
    public void shouldGetFirstAndLast() {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.addFirst("Test1");
        linkedList.addLast("Test2");

        assertEquals(2, linkedList.getSize());
        assertEquals("Test1", linkedList.getFirst());
        assertEquals("Test2", linkedList.getLast());
    }

    @Test
    public void shouldRemoveFirst() {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.addFirst("Test1");
        linkedList.addLast("Test2");

        linkedList.removeFirst();

        assertEquals(1, linkedList.getSize());
        assertEquals("Test2", linkedList.getFirst());
        assertEquals("Test2", linkedList.getLast());
    }

}