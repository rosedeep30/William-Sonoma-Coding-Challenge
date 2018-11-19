package ZipcodeValidation;

import static org.junit.jupiter.api.Assertions.*;
import java.util.*;

/**
 * Test class to test the given program with the edge cases and normal cases.
 */

class CalcMinRangeTest {

    /**
     * testing for the reduced input
     */

    @org.junit.jupiter.api.Test
    void Test1() {

        CalcMinRange range = new CalcMinRange();
        List<List<Integer>> input = new ArrayList<>();
        input.add(Arrays.asList(94133,94133));
        input.add(Arrays.asList(94200,94299));
        input.add(Arrays.asList(94226,94399));

        List<List<Integer>> expected = new ArrayList<>();
        expected.add(Arrays.asList(94133,94133));
        expected.add(Arrays.asList(94200,94399));

        List<List<Integer>> output = range.minRanges(input);

        assertEquals(expected,output);
    }

    /**
     * testing when the input cannot be further reduced and the output is same as input.
     */
    @org.junit.jupiter.api.Test
    void Test2() {

        CalcMinRange range = new CalcMinRange();
        List<List<Integer>> input = new ArrayList<>();
        input.add(Arrays.asList(94133,94133));
        input.add(Arrays.asList(94200,94299));
        input.add(Arrays.asList(94326,94399));

        List<List<Integer>> expected = new ArrayList<>();
        expected.add(Arrays.asList(94133,94133));
        expected.add(Arrays.asList(94200,94299));
        expected.add(Arrays.asList(94326,94399));

        List<List<Integer>> output = range.minRanges(input);

        assertEquals(expected,output);
    }

    /**
     * testing when the input is empty list.
     */
    @org.junit.jupiter.api.Test
    void Test3() {

        CalcMinRange range = new CalcMinRange();
        List<List<Integer>> input = new ArrayList<>();

        List<List<Integer>> expected = new ArrayList<>();

        List<List<Integer>> output = range.minRanges(input);

        assertEquals(expected,output);
    }

    /**
     * testing when the input is null
     */
    @org.junit.jupiter.api.Test
    void Test4() {

        CalcMinRange range = new CalcMinRange();
        List<List<Integer>> input = null;

        List<List<Integer>> expected = null;

        List<List<Integer>> output = range.minRanges(input);

        assertEquals(expected,output);
    }
}