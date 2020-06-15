package NO1201_1299.NO1282;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        List<List<Integer>> ass = new ArrayList<>();
        for (int n = 0; n < groupSizes.length; n++) {
            ass.add(new ArrayList<Integer>());
        }

        for (int n = 0; n < groupSizes.length; n++) {
            ass.get(groupSizes[n]).add(n);
        }
        List<List<Integer>> fut = new ArrayList<>();
        for (int m = 0; m < ass.size(); m++) {//遍历 屁股
            while (ass.get(m).size() != 0) {//m 就是同样大在一起
                ArrayList<ArrayList<Integer>> underwear = new ArrayList<>(ass.get(m).size()/m);
                for (int n = 0; n < underwear.size(); n++) {//
                    underwear.add(new ArrayList<Integer>());
                }
                for (int k = 0; k < ass.get(m).size(); k++) {
                    underwear.get(k %underwear.size()).add(ass.get(m).get(k));
                }
                fut.addAll(underwear);
            }
        }
        return fut;
    }
}