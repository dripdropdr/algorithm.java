class Result {

    /* https://www.hackerrank.com/challenges/palindrome-index/problem?isFullScreen=true
     * Complete the 'palindromeIndex' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts STRING s as parameter.
     */

    public static int palindromeIndex(String s) {
        int first = 0; int last = 0;
        boolean flg = true;
        for (int i=0; i<s.length(); i++){
            if(s.charAt(i) != s.charAt(s.length()-1-i)){
                first = i;
                last = s.length()-1-i;
                flg = false;
                break;
            }
        }
        // already palindrom
        if(flg) return -1;
        
        // Chapter one
        flg = true;
        String exceptfirst = s.substring(0, first) + s.substring(first+1, s.length());
        for (int i=0; i<exceptfirst.length(); i++){
            if (exceptfirst.charAt(i) != exceptfirst.charAt(exceptfirst.length()-1-i)){
                flg = false;
            }
        }
        if (flg) return first;
        
        // Chapter two
        flg = true;
        String exceptsecond = s.substring(0, last) + s.substring(last+1, s.length());
        for (int i=0; i<exceptsecond.length(); i++){
            if(exceptsecond.charAt(i) != exceptsecond.charAt(exceptsecond.length()-1-i)){
                flg = false;
            }
        }
        if (flg) return last;
        return -1;
        
    }
}
