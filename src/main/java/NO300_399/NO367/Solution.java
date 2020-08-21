package NO300_399.NO367;

class Solution {
    public boolean isPerfectSquare(int num) {
        int low = 0;
        int high = num;
        while (low <=num) {
            if ((low + (high - low) / 2) * (low + (high - low) / 2) == num) return true;
           else if ((low + (high - low) / 2) * (low + (high - low) / 2) > num) high = (low + (high - low) / 2 - 1);
           else if ((low + (high - low) / 2) * (low + (high - low) / 2) < num) low = (low + (high - low) / 2 + 1);
            System.out.println(high+""+low);
        }
        return false;
    }
}