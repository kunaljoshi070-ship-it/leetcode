class Solution {
    public double angleClock(int hour, int minutes) {
        double minInDeg = 6*minutes;
        double hourInDeg = 30*(hour%12) + 0.5*minutes;

        double diff = Math.abs(minInDeg-hourInDeg);
        return Math.min(diff, 360 - diff);
    }
}