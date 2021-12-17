package practica;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PregradoTest {
    @Test
    void fail_grado() {
        Pregrado pregrado = new Pregrado("pregrado 1");
        Assert.assertEquals(pregrado.grado(),11 );
    }
}
