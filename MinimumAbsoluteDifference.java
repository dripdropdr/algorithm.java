class Result {

    /* https://www.hackerrank.com/challenges/minimum-absolute-difference-in-an-array/problem?isFullScreen=true
     * Complete the 'minimumAbsoluteDifference' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static int minimumAbsoluteDifference(List<Integer> arr) {
        Comparator<Integer> absoluteValueComparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return Integer.compare(Math.abs(o1), Math.abs(o2));
            }
        };
        arr.sort(absoluteValueComparator);
        
        int res = 999999999;
        for (int i=0; i<arr.size()-1; i++){
            int abs = Math.abs(arr.get(i) - arr.get(i+1));
            if (abs < res){
                res = abs;
            }
        }
        return res;
    }

}
