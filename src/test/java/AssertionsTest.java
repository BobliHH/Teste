import org.junit.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;

import static org.hamcrest.CoreMatchers.allOf;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.AnyOf.anyOf;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class AssertionsTest {

    @AfterClass
    public static void afterAllTests() {
        System.out.println("This message is displayed AFTER ALL test");
    }

    @BeforeClass
    public static void beforeAnyTests() {
        System.out.println("This message is displayed BEFORE ANY tests");
    }

    @Test
    public void testAdd() {
        System.out.println("testAdd");
        int a = 15;
        int b = 20;
        assertEquals(35, a + b);
    }

    @Test
    public void testMatcherIs() {
        System.out.println("testMatcherIs");
        int a = 10;
        int b = 10;
        assertThat(a, is(b));
    }

    @Test
    public void testMatcherAnyOf() {
        System.out.println("testMatcherAnyOf");
        int a = 10;
        int b = 10;
        int c = 10;
        assertThat(a, anyOf(is(b), is(c)));
    }

    @Test
    public void testMatcherAllOf() {
        System.out.println("testMatcherAllOf");
        int a = 10;
        int b = 10;
        int c = 10;
        assertThat(a, allOf(is(b), is(c)));
    }

    @Before
    public void messageBeforeEveryTest() {
        System.out.println("This message is displayed before every test");
    }

    @After
    public void messageAfterEveryTest() {
        System.out.println("This message is displayed after every test");
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testIndexOutOfBounds() {
        ArrayList arrayList = new ArrayList<String>();
        arrayList.get(0);
        System.out.println("testIndexOutOfBounds");
    }

    @Test(expected = ArithmeticException.class)
    public void testArithmetic() {
        System.out.println("ArithmeticException");
        Integer a = 10;
        Integer b = 10 / 0;
    }

    @Test(expected = FileNotFoundException.class)
    public void testFileNotFound() throws FileNotFoundException {
        System.out.println("FileNotFoundException");
        File file = new File("TDD.exe");
        FileReader fr = new FileReader(file);
    }


}

