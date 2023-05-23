class Result {

    /* https://www.hackerrank.com/challenges/missing-numbers/problem?isFullScreen=true
     * Complete the 'missingNumbers' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY arr
     *  2. INTEGER_ARRAY brr
     */

    public static List<Integer> missingNumbers(List<Integer> arr, List<Integer> brr) {

        for (Integer num : arr) {
            brr.remove(num);
        }
        // multiple redundant number exists.
        Set<Integer> set = new HashSet<>(brr);
        List<Integer> res = new ArrayList<>(set);
        res.sort(Integer::compareTo);

        return res;
    }

}
