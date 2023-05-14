/*
 * @lc app=leetcode.cn id=1 lang=java
 *
 * [1] 两数之和
 */

package leetcode_java.lc_0001_two_sum;

import java.util.HashMap;

// @lc code=start
public class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

        for (int i = 0; i < nums.length; i += 1) {
            int item = nums[i];
            int key = target - item;
            if (map.containsKey(key)) {
                return new int[] { map.get(key), i };
            }
            map.put(item, i);
        }

        return new int[0];
    }
}
// @lc code=end
