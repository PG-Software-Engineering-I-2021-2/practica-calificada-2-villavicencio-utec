package practica;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DoctoradoTest {
    @Test
    void fail_grado() {
        Doctorado doctorado = new Doctorado("doctorado 1");
        Assert.assertEquals(doctorado.Grado(),13 );
    }
}
