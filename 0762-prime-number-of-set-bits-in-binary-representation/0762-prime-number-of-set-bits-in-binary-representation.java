class Solution {
    public int countPrimeSetBits(int left, int right) {
        int result = 0;
        for (int i = left; i <= right; i++) {
            int bits = Integer.bitCount(i);
            if (isPrime(bits)) {
                result++;
            }
        }
        return result;
    }

    private boolean isPrime(int n) {
        // Since max bits < 20, we can use a simple switch or bitmask
        return (n == 2 || n == 3 || n == 5 || n == 7 || 
                n == 11 || n == 13 || n == 17 || n == 19);
    }
}