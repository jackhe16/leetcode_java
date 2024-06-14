package leetcode_java.lc_0001_twoSum;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class SolutionTests {
    @Test
    void test_1() {
        assertArrayEquals(new Solution().twoSum(new int[] { 2, 7, 11, 15 }, 9), new int[] { 0, 1 });
    }

    @Test
    void test_2() {
        assertArrayEquals(new Solution().twoSum(new int[] { 3, 2, 4 }, 6), new int[] { 1, 2 });
    }

    @Test
    void test_3() {
        assertArrayEquals(new Solution().twoSum(new int[] { 3, 3 }, 6), new int[] { 0, 1 });
    }
}
