package eyad.dev;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;



public class ArmstrongNumberTest {

    @Test
    void testisArmstrong() {
        ArmstrongNumber armstrongNumber = new ArmstrongNumber();
        assertTrue(armstrongNumber.isArmstrong(370));
        assertEquals(true, armstrongNumber.isArmstrong(371));
        assertFalse(armstrongNumber.isArmstrong(372));
        
    }

}
