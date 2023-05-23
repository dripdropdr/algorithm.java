class Result {

    /* https://www.hackerrank.com/challenges/closest-numbers/problem?isFullScreen=true
     * Complete the 'closestNumbers' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static List<Integer> closestNumbers(List<Integer> arr) {
        arr.sort(Integer::compareTo);
        List<Integer> res = new ArrayList<>();
        int min = 99999999;
        for (int i=0; i<arr.size()-1; i++){
            // consider absolute number.
            int dif = Math.abs(arr.get(i) - arr.get(i+1));
            if (dif < min){
                min = dif;
                if (!res.isEmpty()){
                    res.clear();
                }
                res.add(arr.get(i));
                res.add(arr.get(i+1));
              
            } else if (dif == min){
                res.add(arr.get(i));
                res.add(arr.get(i+1));
            }
        }
        res.sort(Integer::compareTo);
        return res;
    }
}
