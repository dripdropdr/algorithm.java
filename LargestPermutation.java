class Result {

    /* https://www.hackerrank.com/challenges/largest-permutation/problem?isFullScreen=true
     * Complete the 'largestPermutation' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER k
     *  2. INTEGER_ARRAY arr
     */

    public static List<Integer> largestPermutation(int k, List<Integer> arr) {
        
        Map<Integer, Integer> indexMap = new HashMap<>();
        for (int a: arr){
            indexMap.put(a, arr.indexOf(a));
        }
        
        for(int i=0; i<arr.size()&&k>0; i++){
            if (arr.get(i) != arr.size()-i){
                
                int swapVal = arr.get(i);
                int swapIdx = indexMap.get(arr.size()-i);
                
                arr.set(i, arr.size()-i);
                arr.set(swapIdx, swapVal);
                
                indexMap.put(arr.size()-i, i);
                indexMap.put(swapVal, swapIdx);
                
                k--;
            }
        }
        return arr;
    }
}
