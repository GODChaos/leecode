package NO101_199.NO118;//package NO38;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();


        while (numRows != 0) {
            List<Integer> arrayList = new ArrayList<>();
            if (res.size()==0) {
                arrayList.add(1);
            } else {
                arrayList.add(0, 1);
                for (int i = 1; i < res.size() + 1; i++) {
                    arrayList.add(i, res.get(res.size() - 1).get(i - 1) + res.get(res.size() - 1).get(i));
                }
                arrayList.add(res.size(), 1);
            }
            res.add(arrayList);

            numRows--;
        }
        return res;
    }
}

//        if (numRows == 1) {
//            ArrayList<Integer> arrayList = new ArrayList<Integer>();
//            arrayList.add(1);
//            res.add(arrayList);
//            return res;
//        } else if(numRows>1){
//            ArrayList<Integer> arrayList = new ArrayList<Integer>();
//            arrayList.add(0, 1);
//            for (int i = 1; i < numRows - 1; i++) {
//                arrayList.add(i, generate(numRows - 1).get(numRows - 2).get(i - 1) + generate(numRows - 1).get(numRows - 2).get(i ));
//            }
//            arrayList.add(numRows-1, 1);
//            res = generate(numRows - 1);
//            res.add(arrayList);