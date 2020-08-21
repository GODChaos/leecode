package NO200_299.NO278;

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int low =1;
        int high = n;
        while (low <= high) {
            if (isFirstBadVersion((low+ high) / 2)) return ((low+ high) / 2);
            if (isBadVersion((low+ high) / 2)) high = (low+ high) / 2 - 1;
            if (!isBadVersion((low+ high) / 2)) low = (low+ high) / 2+ 1;
        }
        return 0;
    }

    boolean isFirstBadVersion(int version) {
        if (isBadVersion(version)) {
            if (version == 1 || !isBadVersion(version - 1)) return true;
        }
        return false;

    }
}