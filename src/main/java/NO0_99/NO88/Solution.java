package NO0_99.NO88;

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if (nums2.length != 0) {


            for (int i = 0; i < m ; i++) {
                if (nums1[i] > nums2[0]) {
                    int temp = nums1[i];
                    nums1[i] = nums2[0];
                    nums2[0] = temp;
                    for (int j = 0; j < n-1 ; j++) {
                        if (nums2[j] > nums2[j + 1]) {
                            temp = nums2[j];
                            nums2[j] = nums2[j + 1];
                            nums2[j + 1] = temp;
                        }

                    }
                }
                System.out.println(nums1.toString());
            }
            for(int i=0;i<n;i++){
                nums1[m+i]=nums2[i];
            }
        }

    }
}