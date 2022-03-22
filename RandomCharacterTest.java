package com.company;

import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
import static org.junit.Assert.*;

public class RandomCharacterTest {
    @Test
    public void testGetRandomLowerCaseLetter() {
        char test = RandomCharacter.getRandomLowerCaseLetter();
        char test2 = RandomCharacter.getRandomLowerCaseLetter();

        //Check if the right value is generated
        assertTrue(test >= 'a' & test <= 'z');
        assertTrue(test2 >= 'a' & test2 <= 'z');
        // check whether generated values are random
        assertNotEquals(test, test2);
    }

    @Test
    public void testGetRandomUpperCaseLetter() {
        char test = RandomCharacter.getRandomUpperCaseLetter();
        char test2 = RandomCharacter.getRandomUpperCaseLetter();

        //Check if the right value is generated
        assertTrue(test >= 'A' & test <= 'Z');
        assertTrue(test2 >= 'A' & test2 <= 'Z');
        // check whether generated values are random
        assertNotEquals(test, test2);
    }

    @Test
    public void testGetRandomDigitCharacter() {
        char test_data = RandomCharacter.getRandomDigitCharacter();
        char test2 = RandomCharacter.getRandomDigitCharacter();

        //Check if the right value is generated
        assertTrue(test_data >= '0' & test_data <= '9');
        assertTrue(test2 >= '0' & test2 <= '9');
        // check whether generated values are random
        assertNotEquals(test_data, test2);
    }

    @Test
    public void testGetRandomCharacter() {
        char[] test = {RandomCharacter.getRandomDigitCharacter(),
                RandomCharacter.getRandomDigitCharacter()};
        //Check if the right value is generated
        for (char currTest: test) {
            boolean cond1 = (currTest >= '0' & currTest <= '9');
            boolean cond2 = (currTest >= 'A' & currTest <= 'Z');
            boolean cond3 = (currTest >= 'a' & currTest <= 'z');
            assertTrue((cond1 || cond2 || cond3));
        }
        // check whether generated values are random
        assertNotEquals(test[0], test[1]);
    }

    @Test
    public void testGetRandomDigitCharacterPrime(){
        int testVal = Integer.parseInt(String.valueOf(RandomCharacter.getRandomDigitCharacter()));
        boolean check = true;
        for (int i = 2; i <= testVal / 2; ++i) {
            //0 is not a prime number
            if(testVal == 0){
                check = false;
                break;
            }
            // condition for non-prime number
            if ((testVal % i == 0)){
                check = false;
                break;
            }

        }
        assertTrue(check);
    }

    public static void main(String[] args) {
        Result result = JUnitCore.runClasses();
        for (Failure fail : result.getFailures()) {
            System.out.println(fail.toString());
        }
        System.out.println(result.wasSuccessful());
    }
}
