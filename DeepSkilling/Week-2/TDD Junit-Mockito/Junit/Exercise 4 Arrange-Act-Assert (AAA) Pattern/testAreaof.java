import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class testAreaof {
    private areaofSq area;
    private  areaofRec areaRec;
    float length=5;
    float width=6;
    float expectedRec;
    float expectedVal;
    float Area = 4;
    @BeforeEach
    public void SetMethod(){
        areaRec=new areaofRec();
        expectedRec=length*width;
        expectedVal=Area*Area;
        area =new areaofSq();
    }
    @Test
    public void testArea(){
        Assertions.assertEquals(expectedVal,area.areaSquare(4));
    }
    @Test
    public void testRec(){
        Assertions.assertEquals(expectedRec,areaRec.areaRec(5,6));
    }
    @AfterEach
    public void displayRes(){
        System.out.println("Test Was completed and result Displayed Successfully");
    }
}
