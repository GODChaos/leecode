package NO0_99.NO35;

class Solution {
    public int searchInsert(int[] nums, int target) {

        int index = -1;
        for (int n : nums) {
            index++;

            if (n >= target) {
                return index;
            }

        }
        return index + 1;
    }
}

