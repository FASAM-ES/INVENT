import br.edu.fasam.figurasgeometricasapp.TrianguloKhalil;
import junit.framework.TestCase;

/**
 *
 * @author leandro khalil
 */
public class TrianguloKhalilTest extends TestCase {
    
    
    public TrianguloKhalilTest(String testName) {
        super(testName);
    }
    
    @Override
    protected void setUp() throws Exception {
        super.setUp();
    }
    
    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }

    // TODO add test methods here. The name must begin with 'test'. For example:
    // public void testHello() {}
    
    public void testeCalcularArea()
    {
        TrianguloKhalil triangulo = new TrianguloKhalil(4,8,10);
        assertEquals(15.199, triangulo.calulaArea());
    }
    
    public void testeCalculaPerimetro()
    {
        TrianguloKhalil triangulo = new TrianguloKhalil(4,8,10);
        assertEquals(11.0, triangulo.getPerimetro());
    }
}
