import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class PowerOf_2 {

    public static void main(String[] args) {
        int number = 32;
        if (isPowerOf2(number)) {
            System.out.println(number + " is a power of 2.");
        } else {
            System.out.println(number + " is not a power of 2.");
        }
    }

    public static boolean isPowerOf2(int number) {
        if (number <= 0) {
            return false;
        }
        while (number > 1) {
            if (number % 2 != 0) {
                return false;
            }
            number /= 2;
        }
        return true;

    }
    @Test
    public void testIsPowerOf2() {
        // Test case 1: 8 sayısı 2'nin kuvvetidir
        assertTrue(PowerOf_2.isPowerOf2(8));

        // Test case 2: 16 sayısı 2'nin kuvvetidir
        assertTrue(PowerOf_2.isPowerOf2(16));

        // Test case 3: 1 sayısı 2'nin kuvvetidir
        assertTrue(PowerOf_2.isPowerOf2(1));

        // Test case 4: 10 sayısı 2'nin kuvveti değildir
        assertFalse(PowerOf_2.isPowerOf2(10));

        // Test case 5: 0 sayısı 2'nin kuvveti değildir
        assertFalse(PowerOf_2.isPowerOf2(0));

        // Test case 6: Negatif sayılar 2'nin kuvveti değildir
        assertFalse(PowerOf_2.isPowerOf2(-16));

        // Test case 7: 1000000 sayısı 2'nin kuvveti değildir
        assertFalse(PowerOf_2.isPowerOf2(1000000));

    }
}
