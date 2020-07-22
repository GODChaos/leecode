package NO300_399.NO350;


import java.util.ArrayList;

class Solution {
    ArrayList<Integer> list = new ArrayList();

    public int[] intersect(int[] nums1, int[] nums2) {
        if (nums1.length * nums2.length == 0) {

            int[] d = new int[list.size()];
            for(int i = 0;i<list.size();i++){
                d[i] = list.get(i);
            }
            return d;
        }
        for (int i = 0; i < nums1.length; i++)

    }
}