class Result {

    /* https://www.hackerrank.com/challenges/flipping-bits/problem?isFullScreen=true
     * Complete the 'flippingBits' function below.
     *
     * The function is expected to return a LONG_INTEGER.
     * The function accepts LONG_INTEGER n as parameter.
     */

    public static long flippingBits(long n) {
        return n^0xFFFFFFFFL;
    }

}
