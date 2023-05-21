class Result {
    
    /* The lonelyInteger problem in hackerranck
     * https://www.hackerrank.com/challenges/lonely-integer/problem
     * Complete the 'lonelyinteger' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY a as parameter.
     */

    public static int lonelyinteger(List<Integer> a) {
    // using bit. Accumulate all values;
        int res = 0;
        for (int i: a){
        res = res^i;
        }
        return res;
    }

    public static int lonelyinteger(List<Integer> a) {
    // using HashMap;
        HashMap<Integer, Integer> dict = new HashMap<>();
        for (int i: a){
        if (dict.containsKey(i)) dict.remove(i);
        else dict.put(i, 1);
        }
        return dict.keySet().stream().findFirst().orElse(0);
    }

}
