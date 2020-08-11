package NO1500_1599.NO1528;

class Solution {
    public String restoreString(String s, int[] indices) {
        char[] res = new char[s.length()];
        for(int i=0;i<indices.length;i++){
            int j=indices[i];
            res[j]=s.charAt(i);
        }return  res.toString();

    }
}