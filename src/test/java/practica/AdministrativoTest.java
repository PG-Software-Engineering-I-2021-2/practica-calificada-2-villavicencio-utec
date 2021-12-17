package practica;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AdministrativoTest {
    @Test
    void fail_sueldo() {
        Administrativo administrativo = new Administrativo("profesor 1");
        Assert.assertEquals( administrativo.Sueldo(),2100);
    }
}
