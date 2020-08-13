package NO600_699.NO657;//package NO38;

class Solution {
    public boolean judgeCircle(String moves) {
        int[] array = {0, 0};
        for (int i = 0; i < moves.length(); i++) {
            char move = moves.charAt(i);
            switch (move) {
                case 'R':
                    array[0]++;
                    break;
                case 'L':
                    array[0]--;
                    break;
                case 'U':
                    array[1]++;
                    break;
                case 'D':
                    array[1]--;
                    break;
            }
        }
        return (array[0] == 0 && array[1] == 0);
    }
}