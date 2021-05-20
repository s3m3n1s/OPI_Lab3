// package Hello;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TestTest {
    @Test
    public void testHello() {
        HelloWorld hello = new HelloWorld();
        assertEquals("Hello, Wolrd!", hello.sayHello());
    }
}
