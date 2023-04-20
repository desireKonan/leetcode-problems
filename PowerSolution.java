class Solution {
    public double myPow(double x, int n) {
        if(n == 0) 
            return 1;
        else if(n == 1 || n == Integer.MAX_VALUE) 
            return x;
        else if(n == Integer.MIN_VALUE)
            return (x == 1 || x == -1) ? 1 : 0;
        else if(n == -1) 
            return (1 / x);
        else if(n < 0)
            if(n % 2 != 0)
                return (1 / x) * myPow((1 / x), -n / 2) * myPow((1 / x), -n / 2);
            else
                return myPow((1 / x), -n / 2) * myPow((1 / x), -n / 2);
        else 
            if(n % 2 != 0)
                return x * myPow(x, n / 2) * myPow(x, n / 2); 
            else
                return myPow(x, n / 2) * myPow(x, n / 2); 
    }
}