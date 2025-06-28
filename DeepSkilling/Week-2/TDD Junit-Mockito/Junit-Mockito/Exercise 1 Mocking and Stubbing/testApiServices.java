import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.mockito.Mockito;

import static org.mockito.Mockito.when;

public class testApiServices {
    int id;
    String expected;
    @BeforeEach
    public void intializeval(){
        id=101;
        expected="Mock Data";
    }
    @Test
    public void testApiService(){
        ApiService api= Mockito.mock(ApiService.class);
        when(api.getName(101)).thenReturn("Mock Data");
        MyServices service = new MyServices(api);
        String result=service.displayName(id);
        Assertions.assertEquals(expected,result);
    }

}
