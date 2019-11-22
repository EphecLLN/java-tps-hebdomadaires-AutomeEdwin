/**
 * 
 */
package tp3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * @author edwin
 *
 */
class CalculatriceTest {

    /**
     * Test method for {@link tp3.Calculatrice#carre(int)}.
     */
    @Test
    void testCarre() {
	Calculatrice calc = new Calculatrice();
	assertEquals(9, calc.carre(3));
    }

}
