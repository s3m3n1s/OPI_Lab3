import static org.junit.Assert.assertEquals;
import org.junit.Test;
public class TestTest {
    @Test
    public void testHello() {
        HelloWorldAltAlt hello = new HelloWorldAltAlt();
        assertEquals("Hello, World!", hello.sayHello());
    }
}
