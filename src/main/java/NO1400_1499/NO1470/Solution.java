package NO1400_1499.NO1470;


class Solution {
//    public int[] shuffle(int[] nums, int n) {
//        int l = nums.length;
//        int q = l / n; //每区几个
//        int[] res = new int[l];
//        for (int i = 1; i < n + 1; i++) {
//            for (int index =0; index < q  ; index++) {//index 每小组都从0算
//                res[index * q + i -1] = nums[index+q*(i-1)];//外圈第i次循环  就是第  index  组里第  i  个
//            }
//        }
//        return res;//题目看错了,这个解法很屌
//    }

    public int[] shuffle(int[] nums, int n) {
        int l = nums.length;
        int[] res = new int[l];
        for(int i=0;i<l;i++){
            if(i<l/2){
                res[2*i]=nums[i];
            }else {
              res[(i-l/2)*2+1]=nums[i];

                }
            }return res;
        }
    }

