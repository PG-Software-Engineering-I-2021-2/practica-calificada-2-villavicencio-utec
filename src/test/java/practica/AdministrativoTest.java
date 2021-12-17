package practica;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AdministrativoTest {
    @Test
    void fail_sueldo_admin() {
        Administrativo administrativo = new Administrativo("profesor 1");
        Assert.assertEquals( administrativo.sueldo(),2100);
    }
}
