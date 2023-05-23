class Result {

    /* https://www.hackerrank.com/challenges/camelcase/problem?isFullScreen=true
     * Complete the 'camelcase' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts STRING s as parameter.
     */

    public static int camelcase(String s) {
    // Write your code here
        int res = 1;
        for (Character _s : s.toCharArray())
            if(Character.isUpperCase(_s)) res++;
        return res;
    }

}
