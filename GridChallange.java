class Result {

    /* https://www.hackerrank.com/challenges/grid-challenge/problem?isFullScreen=true
     * Complete the 'gridChallenge' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING_ARRAY grid as parameter.
     */

    public static String gridChallenge(List<String> grid) {
        // Should consider row unsorted case
        for(int i=0; i<grid.size(); i++){
            char[] tmp = grid.get(i).toCharArray();
            Arrays.sort(tmp);
            grid.set(i, new String(tmp));
        }
        for (int i=0; i<grid.size()-1; i++){
            for(int j=0; j<grid.get(0).length(); j++){
                if (grid.get(i).charAt(j) > grid.get(i+1).charAt(j)){
                    System.out.println(grid.get(i).charAt(j));
                    return "NO";
                }
            }
        }
        return "YES";
    }
}
