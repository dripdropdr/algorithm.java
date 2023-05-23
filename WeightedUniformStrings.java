class Result {

    /* https://www.hackerrank.com/challenges/weighted-uniform-string/problem?isFullScreen=true
     * Complete the 'weightedUniformStrings' function below.
     *
     * The function is expected to return a STRING_ARRAY.
     * The function accepts following parameters:
     *  1. STRING s
     *  2. INTEGER_ARRAY queries
     */
    
    // The solution is time out in 2 case, I will complement it later.
    public static List<String> weightedUniformStrings(String s, List<Integer> queries) {

        List<String> res = new ArrayList<>();
        int weight_offset = 96 ;
        char[] arr = s.toCharArray();
        
        List<Integer> partition = new ArrayList<>();
        partition.add(0);
        for (int i=0; i<arr.length-1; i++){
            if (s.charAt(i) != s.charAt(i+1)){
                partition.add(i+1);
            }
        }
        partition.add(s.length());
//         System.out.println(partition.toString());

        List<Integer> weights = new ArrayList<>();
        for (int i=0; i<partition.size()-1; i++){
            int ascii = (int) s.charAt(partition.get(i)); // 99
            ascii -= weight_offset; // 3
            for (int j=1; j<partition.get(i+1)-partition.get(i)+1; j++){ // 4-2 +1 = 3, (1,2)
//                 System.out.print(s.charAt(partition.get(i))+" ");
//                 System.out.println(j);
                weights.add((ascii)*j);
            }
        }
        
//         System.out.println(weights.toString());
        
        for (int q:queries){
            if (weights.contains(q)){
                res.add("Yes");
            } else{
                res.add("No");
            }
        }
        return res;
    }

}
