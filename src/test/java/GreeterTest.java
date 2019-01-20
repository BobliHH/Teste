import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class GreeterTest {
    @Test
    public void testIfGreeterSaysHelloToTheWorld() {
        Greeter greeter = new Greeter();
        assertThat(greeter.sayHello(), equalTo("Hello world!"));
    }
}
