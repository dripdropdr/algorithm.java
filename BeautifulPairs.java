class Result {

    /* https://www.hackerrank.com/challenges/beautiful-pairs/problem?isFullScreen=true
     * Complete the 'beautifulPairs' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY A
     *  2. INTEGER_ARRAY B
     */

    public static int beautifulPairs(List<Integer> A, List<Integer> B) {
        // Write your code here
        int res = 0;
        HashMap<Integer, Integer> count = new HashMap<>();
        for (int a:A){
            count.put(a, count.getOrDefault(a, 0)+1);
        }
        
        for (int b:B){
            // 순열x 조합, 중복이 안 됨. res에 한 pair 더해주면, 
            if (count.containsKey(b) && count.get(b) > 0) {
                res++;
                count.put(b, count.get(b) - 1);
            }
        }
       // B의 요소 중 한 가지를 beautiful pairs가 될 수 있도록 수정함->res가 1 커짐
       // res==B.size()일 경우, 하나 변경하면 1 빠짐
        return (res < B.size()) ? res + 1 : res - 1;
    }
}
