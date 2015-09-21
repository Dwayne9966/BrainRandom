package com.example.dwayne.brainrandom;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by Dwayne on 2015/09/10.
 */

    public class RandomNumberGenerator {

        public static Integer[] getNumbers() {
            ArrayList<Integer> numbers = new ArrayList<>();
            Random randomiser = new Random();

            boolean hasTen = false;

            while (!hasTen) {
                int next = randomiser.nextInt(10);
                if (numbers.contains(next)) {
                    //do nothing
                }
                else {
                    numbers.add(next);
                }

                if (numbers.size() > 9) {
                    hasTen = true;
                }
            }

            return numbers.toArray(new Integer[numbers.size()]);
        }
    }

