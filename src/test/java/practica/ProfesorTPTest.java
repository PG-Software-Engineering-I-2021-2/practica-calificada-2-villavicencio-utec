package practica;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ProfesorTPTest {
    @Test
    void fail_sueldo() {
        ProfesorTP profesorTP = new ProfesorTP("profesor 1");
        Assert.assertEquals( profesorTP.Sueldo(),2000);
    }
}
