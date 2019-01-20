import org.junit.Before;
import org.junit.Test;



import static org.junit.Assert.assertEquals;

public class CustomListTest {
    private CustomList customList;
    @Before

    public void initCustomList() {
        customList = new CustomList();
    }

    @Test
    public void testWhenAListHasAnElementIsEmptyMethodReturnFalse(){
        customList.add("abc");
        assertEquals(false,customList.isEmpty());
    }

    @Test
    public void testWhenAListIsEmptyMethodReturnsTrue(){

        assertEquals(true,customList.isEmpty());
    }

    @Test
    public void testWhenAnElementIsAddedToAnEmptyListSizeReturnsOne(){
        customList.add("a");
        assertEquals(1,customList.size());
    }

    @Test

    public void testWhenAnElementIsAddedOnAnEmptyListGetReturnsThatElement(){
        customList.add("b");
        assertEquals("b",customList.get(0));
    }

    @Test
    public void testWhenTwoElementsAreAddedToAnEmptyListGetReturnBothElements(){
        customList.add("d");
        customList.add("e");
        assertEquals("d",customList.get(0));
        assertEquals("e",customList.get(1));
    }
}
