package NO300_399.NO336;//package NO38;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.function.Predicate;

class Solution {
    public List<List<Integer>> palindromePairs(String[] words) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words.length; j++) {
                if (j != i) {
                    String two = words[i] + words[j];

                    if (isPalindrome(two)) {
                        ArrayList<Integer> arrayList = new ArrayList<>();
                        arrayList.add(i);
                        arrayList.add(j);
                        result.add(arrayList);
                    }

                }
            }
        }
        return result;


    }

    public boolean isPalindrome(String s) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length() / 2; i++) {
            stack.push(s.charAt(i));
        }
        for (int i = (s.length() + 1) / 2; i < s.length(); i++) {
            if (s.charAt(i) != stack.pop()) return false;
        }
        return true;

    }
}