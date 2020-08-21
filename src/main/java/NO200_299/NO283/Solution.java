package NO200_299.NO283;
class Solution {
    public void moveZeroes(int[] nums) {
        int firstZero=-1;

        for (int i=0;i<nums.length;i++){
                if (firstZero==-1){
                    if (nums[i]==0)firstZero=i;
                }else if (nums[i]!=0){
                    nums[firstZero]=nums[i];
                    nums[i]=0;
                    while (nums[firstZero]!=0){
                        firstZero++;
                    }
                }

        }

    }
}