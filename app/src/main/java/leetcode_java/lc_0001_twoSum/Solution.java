/*
 * @lc app=leetcode.cn id=1 lang=java
 *
 */

package leetcode_java.lc_0001_twoSum;

import java.util.HashMap;

// @lc code=start

public class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> m = new HashMap<Integer, Integer>();

        for (int i = 0; i < nums.length; i += 1) {
            int item = nums[i];
            int key = target - item;
            if (m.containsKey(key)) {
                return new int[] { m.get(key), i };
            }
            m.put(item, i);
        }

        return new int[0];
    }
}

// @lc code=end
