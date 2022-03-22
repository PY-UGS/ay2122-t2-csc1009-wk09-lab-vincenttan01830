package com.company;

import java.util.Arrays;
import java.util.Random;

public class RandomCharacter {
    public static char getRandomLowerCaseLetter() {
        Random rand = new Random();
        int randInt = rand.nextInt(97, 123);
        return (char)randInt;
    }

    public static char getRandomUpperCaseLetter() {
        Random rand = new Random();
        int randInt = rand.nextInt(65, 91);
        return (char)randInt;
    }

    public static char getRandomDigitCharacter() {
        Random rand = new Random();
        int randInt = rand.nextInt(48, 58);
        return (char)randInt;
    }

    public static char getRandomCharacter() {
        Random rand = new Random();
        int randInt = rand.nextInt(1, 3);
        if(randInt == 1){
            return getRandomLowerCaseLetter();
        }
        else if(randInt == 2){
            return getRandomUpperCaseLetter();
        }
        else if(randInt == 3){
            return getRandomUpperCaseLetter();
        }
        else{
            return 1;
        }
    }

    public static void main(String[] args){
        char[] lowerCase = new char[15];
        char[] upperCase = new char[15];
        char[] digit = new char[15];
        char[] character = new char[15];
        for(int i=0; i < 4; i++){
            for(int j=0; j < 15; j++){
                if(i == 0){
                    lowerCase[j] = getRandomLowerCaseLetter();
                }
                else if(i == 1){
                    upperCase[j] = getRandomUpperCaseLetter();
                }
                else if(i == 2){
                    digit[j] = getRandomDigitCharacter();
                }
                else {
                    character[j] = getRandomCharacter();
                }
            }
        }
        System.out.println("Fifteen random lower case letters: " + Arrays.toString(lowerCase));
        System.out.println("Fifteen random upper case letters: " + Arrays.toString(upperCase));
        System.out.println("Fifteen random digits: " + Arrays.toString(digit));
        System.out.println("Fifteen random characters: " + Arrays.toString(character));
    }
}
