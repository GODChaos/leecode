package NO1400_1499.NO1470;


class Solution {
//    public int[] shuffle(int[] nums, int n) {
//        int l = nums.length;
//        int q = l / n; //ÿ������
//        int[] res = new int[l];
//        for (int i = 1; i < n + 1; i++) {
//            for (int index =0; index < q  ; index++) {//index ÿС�鶼��0��
//                res[index * q + i -1] = nums[index+q*(i-1)];//��Ȧ��i��ѭ��  ���ǵ�  index  �����  i  ��
//            }
//        }
//        return res;//��Ŀ������,����ⷨ�܌�
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

