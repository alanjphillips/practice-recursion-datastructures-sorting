package queue;

import org.junit.Test;

import static org.junit.Assert.*;


public class QueueTest {

    @Test
    public void shouldEnqueue() throws Exception {
        Queue<String> queue = new Queue<>();
        queue.enqueue("test1");
        queue.enqueue("test2");

        assertEquals(2, queue.getSize());

    }

    @Test
    public void shouldDequeue() throws Exception {
        Queue<String> queue = new Queue<>();
        queue.enqueue("test1");
        queue.enqueue("test2");

        assertEquals("test1", queue.dequeue());
        assertEquals("test2", queue.dequeue());
        assertEquals(0, queue.getSize());
    }
}