import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Question1Test {

    @Test
    void isPrime() {
        int[] primeNumbers = {2, 3, 5, 7, 11, 13, 17, 19, 23};
        for(int i = 0; i < primeNumbers.length; i++) {
            assertTrue(Question1.isPrime(primeNumbers[i]));
        }
    }
    @Test
     void isNotPrime() {
        int[] notPrimeNumbers = {4, 6, 8, 9, 10, 12, 15, 18, 20};
        for (int i = 0; i < notPrimeNumbers.length; i++) {
            assertFalse(Question1.isPrime(notPrimeNumbers[i]));
        }
    }

    @Test
    void factor() {

    }
}

 
