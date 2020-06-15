package NO1400_1499.NO1450;


class Solution {
    public int busyStudent(int[] startTime, int[] endTime, int queryTime) {
        int ass = startTime.length;
        for (int shit = 0; shit < startTime.length; shit++) {
            if (startTime[shit] > queryTime | endTime[shit] < queryTime) {
                ass--;
            }
        }return  ass;

    }
}
