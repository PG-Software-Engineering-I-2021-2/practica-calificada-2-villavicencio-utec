package practica;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ProfesorTCTest {

    @Test
    void fail_sueldo() {
        ProfesorTC profesorTC = new ProfesorTC("profesor 1");
        Assert.assertEquals( profesorTC.sueldo(),1500);
    }
}
