package stack;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;


public class StackTest {

    @Test
    public void shouldPushOntoStack() {
        Stack<String> stack = new Stack<>();
        stack.push("test1");
        stack.push("test2");

        assertEquals(2, stack.getSize());
    }


    @Test
    public void shouldPopFromStackInLIFOOrder() {
        Stack<String> stack = new Stack<>();
        stack.push("test1");
        stack.push("test2");

        assertEquals(2, stack.getSize());

        assertEquals("test2", stack.pop());
        assertEquals(1, stack.getSize());

        assertEquals("test1", stack.pop());
        assertEquals(0, stack.getSize());

        assertNull(stack.pop());
    }

}