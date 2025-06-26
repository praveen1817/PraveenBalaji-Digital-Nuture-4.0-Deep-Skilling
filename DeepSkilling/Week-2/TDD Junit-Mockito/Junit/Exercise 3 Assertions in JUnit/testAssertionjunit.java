import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class testAssertionjunit {
    static ArrayList<Integer> arr1 = new ArrayList<>();
    static ArrayList<Integer> arr2 = new ArrayList<>();
    static ArrayList<Integer> arr3 = new ArrayList<>();
    @BeforeAll
    static public void AddVal(){
        arr1.add(1);
        arr1.add(2);
        arr1.add(3);
        arr2.add(1);
        arr2.add(2);
        arr2.add(3);
        arr3.add(4);
        arr3.add(5);
        arr3.add(6);

    }

    @Test
    public void testArray() {

        Assertions.assertEquals(arr1, arr2);
    }

    @Test
    public void arrTrue() {
        Assertions.assertTrue(arr1.get(0) < arr3.get(0));
    }
    @Test
    public void checkEmpty()
    {
        Assertions.assertNotNull(arr3);
    }
    @Test
    public void notEqual(){
        Assertions.assertNotEquals(arr1.get(0),arr2.get(2));
    }
    @Test
    public void falseCon(){
        Assertions.assertFalse(arr1.get(1) == arr3.get(1));
    }
}
