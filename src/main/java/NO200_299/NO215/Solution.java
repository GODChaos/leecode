package NO200_299.NO215;

 

class Solution {
    public int findKthLargest(int[] nums, int k) {

        int[] array = new int[k];
        for (int n = 0; n < k; n++) {
            array[n] = Integer.MIN_VALUE;
        }
        for (int n = 0; n < nums.length; n++) {
            if (nums[n] > array[0]) {
                array[0] = nums[n];
                for (int m = 0; m < k - 1; m++) {
                    if (array[m] > array[m + 1]) {
                        int temp = array[m];
                        array[m] = array[m + 1];
                        array[m + 1] = temp;
                    }
                }
            }
        }
        return array[0];
    }
}