/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package leetcode_java;

import java.util.Arrays;

import leetcode_java.lc_0001_two_sum.Solution;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());

        Solution s = new Solution();
        int[] result = s.twoSum(new int[] { 2, 7, 11, 15 }, 9);
        System.out.println(Arrays.toString(result));
        System.out.println(Arrays.toString(new int[] { 0, 1 }));
    }
}
