package NO0_99.NO26;

class Solution {
    public int removeDuplicates(int[] nums) {
        int length = nums.length;
        for (int i = 0; i < length; i++) {
            if (i < length - 1 && nums[i] == nums[i + 1]) {// �������׺���
                for (int j = i; j < length - 1; j++) {
                    nums[j] = nums[j + 1];
                }
                length--;
                i--;
            }


        }
        return length;
    }
}
