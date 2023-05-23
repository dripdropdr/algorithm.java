class Result {

    /* https://www.hackerrank.com/challenges/diagonal-difference/problem
     * Complete the 'diagonalDifference' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY arr as parameter.
     */

    public static int diagonalDifference(List<List<Integer>> arr) {
    // Write your code here
        int res1 = 0;
        int res2 = 0;
        for (int i = 0; i<arr.size(); i++){
            res1 += arr.get(i).get(i);
            res2 += arr.get(i).get(arr.size()-i-1);   
        }
        return Math.abs(res1-res2);
    }
}
