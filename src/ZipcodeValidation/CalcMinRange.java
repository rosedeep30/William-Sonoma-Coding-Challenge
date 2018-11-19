package ZipcodeValidation;

import java.util.*;

/**
 * Program to calculate the minimum number of ranges required to represent the restricted Zip code ranges
 * from the given restricted Zip code ranges.
 *
 * @author Rosedeep Singh
 */
public class CalcMinRange {

    /**
     * function to calculate the minimum number of ranges required
     * @param zipcodes which is the list of all the restricted zipcodes.
     * @return A list of minimum ranges used to represent the given restrictions.
     */

    public  List<List<Integer>> minRanges(List<List<Integer>> zipcodes) {

        if (zipcodes == null || zipcodes.size() <= 1) // if the zipcodes is null or there is 0 or 1 zipcode range return zipcodes.
            return zipcodes;

        // Sort the starting point by ascending order using an Comparator
        zipcodes.sort((i1, i2) -> Integer.compare(i1.get(0), i2.get(0)));

        List<List<Integer>> result = new LinkedList<>();
        int start = zipcodes.get(0).get(0);
        int end = zipcodes.get(0).get(1);

        for (List<Integer> zipcode : zipcodes) {

            if (zipcode.get(0) <= end) // Overlapping zip codes, move the end if needed
                end = Math.max(end, zipcode.get(1));

            else {                     // Different zip codes, add the previous one to the result and reset start and end.

                result.add(Arrays.asList(start, end));
                start = zipcode.get(0);
                end = zipcode.get(1);
            }
        }

        // Add the last zipcode
        result.add(Arrays.asList(start, end));
        return result;
    }
}
