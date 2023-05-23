class Result {

    /* https://www.hackerrank.com/challenges/two-characters/problem?isFullScreen=true
     * Complete the 'superReducedString' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String superReducedString(String s) {
        int ptr = 1;
        while(ptr<s.length()){
            if (s.charAt(ptr-1) == s.charAt(ptr)){
                s = s.replaceAll(s.substring(ptr-1, ptr+1), "");
                ptr = 1;
            } else{
                ptr ++;
            }
        }
        if (s.isEmpty()){
            return "Empty String";
        } else{
            return s;
        }
    }

}
