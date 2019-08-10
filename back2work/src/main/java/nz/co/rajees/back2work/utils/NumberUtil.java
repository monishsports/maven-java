package nz.co.rajees.back2work.utils;

import java.util.ArrayList;
import java.util.List;

/**
 * Utility to help with number crunching
 */
public class NumberUtil {

    /**
     * Extract a list of even numbers from a list of odd and even numbers
     * @param listOfNumbers
     * @return A list of even numbers only
     */
    public static List<String> extractEvenNumbers(List<String> listOfNumbers) {

        List<String> result = new ArrayList<String>();
        for(String numberString: listOfNumbers) {
            Integer number = Integer.valueOf(numberString);
            if(number % 2 == 0) {
                result.add(numberString);
            }
        }
        return result;
    }
}
