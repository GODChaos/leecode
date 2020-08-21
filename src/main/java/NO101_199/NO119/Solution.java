package NO101_199.NO119;

import java.util.ArrayList;
import java.util.List;

class Solution {
    List<Integer> res = new ArrayList<>();

    public List<Integer> getRow(int rowIndex) {


        if (rowIndex == 1) res.add(1);
       while (rowIndex > 1) {


            List<Integer> list = new ArrayList<>();
            list.add(1);
            for (int i = 1; i < res.size(); i++) {
                list.add(res.get(i - 1) + res.get(i));
            }
            list.add(1);
            res = list;
            rowIndex--;
        }
        return res;
    }
}