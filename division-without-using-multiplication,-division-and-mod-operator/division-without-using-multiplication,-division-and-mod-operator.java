class Solution {
    public int divide(int a, int b) {

        boolean negative = (a < 0) ^ (b < 0);
        long dividend = Math.abs((long) a);
        long divisor = Math.abs((long) b);
        
        int quotient = 0;
        
        for(int i = 31; i >= 0; i--) {
            if((divisor << i) <= dividend) {
                dividend -= (divisor << i);
                quotient += (1 << i);
            }
        }
        
        return negative ? -quotient : quotient;
    }
}