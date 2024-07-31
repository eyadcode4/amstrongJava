package eyad.dev;


import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class ArmstrongTest {
    
@Test
    public void testIsArmstrong() {
        assertTrue(Armstrong.isArmstrong(370));
        assertTrue(Armstrong.isArmstrong(371));
        assertTrue(Armstrong.isArmstrong(335));
        
    }
}
