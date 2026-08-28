import java.util.*;

class Solution {
    public int firstMissingPositive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        int positive = 1;
        while (set.contains(positive)) {
            positive++;
        }
        return positive;
    }
}