class Result {

    /* https://www.hackerrank.com/challenges/two-characters/problem?isFullScreen=true
     * Complete the 'alternate' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts STRING s as parameter.
     */

    public static int alternate(String s) {
    // Write your code here
        Set<Character> mySet = new HashSet<>();
        for(char c:s.toCharArray()){
            mySet.add(c);
        }

        int maxLength = 0;
        // examine to all pairs of components.
        for (char c1: mySet) {
            for (char c2: mySet) {
                if (c1 != c2) {
                    StringBuilder sb = new StringBuilder();
                    for(int i=0; i<s.length(); i++){
                        if(s.charAt(i)==c1 || s.charAt(i)==c2){
                            sb.append(s.charAt(i));
                        }
                    }

                    System.out.println(c1 + " " + c2 + " " + sb);

                    boolean hasAlternate = true;
                    for (int i=0; i<sb.length()-1; i++){
                        if (sb.charAt(i) == sb.charAt(i+1)){
                            hasAlternate = false;
                            break;
                        }
                    }

                    if (hasAlternate){
                        if (sb.length()>maxLength){
                            maxLength = sb.length();
                        }
                    }
                }
            }
        }
        return maxLength;
    }
}
