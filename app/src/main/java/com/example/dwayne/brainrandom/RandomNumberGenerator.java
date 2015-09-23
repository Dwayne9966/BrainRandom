package com.example.dwayne.brainrandom;

import java.util.ArrayList;
import java.util.Random;

/**
 * Class to generate an array of numbers.
 */
public class RandomNumberGenerator  {

    public static Integer[] getNumbers(int howManyNumber, int fromZeroToThisMany) {
        ArrayList<Integer> numbers = new ArrayList<>();
        Random randomiser = new Random();
        boolean hasTen = false;

        while (!hasTen) {
            int next = randomiser.nextInt(fromZeroToThisMany);
            if (numbers.contains(next)) {
                //do nothing
            }
            else {
                numbers.add(next);
            }
            if (numbers.size() > (howManyNumber-1)) {
                hasTen = true;
            }
        }
        return numbers.toArray(new Integer[numbers.size()]);
    }
}

