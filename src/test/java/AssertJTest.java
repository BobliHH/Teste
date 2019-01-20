import org.junit.Test;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class AssertJTest {

    @Test
    public void Test2StringsAreIdentical() {
        String a = "abc";
        assertThat(a).isEqualTo("abc");

    }

    @Test
    public void testMultipleArrayConditions() {
        String[] a = {"abc", "def", "ghi"};
        assertThat(a)
                .hasSize(3)
                .contains("def")
                .doesNotContain("xyz");
    }
}
