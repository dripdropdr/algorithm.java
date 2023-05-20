class Result {

    /* The sumXor problem in HackerRank
     * https://www.hackerrank.com/challenges/three-month-preparation-kit-sum-vs-xor/problem?h_r=internal-search
     * 
     * Complete the 'sumXor' function below.
     *
     * The function is expected to return a LONG_INTEGER.
     * The function accepts LONG_INTEGER n as parameter.
     */

    public static long sumXor(long n) {
    // More effecient one.
        // Count the number of unset bits
        long count = 0;
        while(n > 0) {
            // If bit is not set, increment the count
            if((n & 1) == 0) {
                count++;
            }
            // Right shift to the next bit
            n >>= 1;
        }
        // The result is 2 to the power of the number of unset bits
        return 1L << count;
    }
  
    public static long sumXor2(long n) {
    // More high time complexity.
      int res = 0;
        byte nByte = (byte) n;
        for (long i = 0; i<=n; i++){
            byte iByte = (byte) i;
            byte xorResult = (byte) (nByte^iByte);
            long longXOR = xorResult;
            long longSUM = n + i; 
            if (longXOR == longSUM){
            res += 1;
            }
        }
        return res;
    }

}
