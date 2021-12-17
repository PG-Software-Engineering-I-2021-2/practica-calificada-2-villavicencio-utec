package practica;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MaestriaTest {
    @Test
    void fail_grado() {
        Maestria maestria = new Maestria("maestria 1");
        Assert.assertEquals(maestria.grado(),12 );
    }

}
