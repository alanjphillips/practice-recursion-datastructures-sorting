package misc;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by alan on 13/09/15.
 */
public class HelloWorldTest {

    @Test
    public void shouldGetHelloWorldText() throws Exception {
        HelloWorld helloWorld = new HelloWorld();
        String expected = "Hello World!";

        String actual = helloWorld.getHelloWorldText();

        assertEquals(expected, actual);
    }
}