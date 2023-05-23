class Result {

    /* https://www.hackerrank.com/challenges/insertionsort1/problem
     * Complete the 'insertionSort1' function below.
     *
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. INTEGER_ARRAY arr
     */

    public static void insertionSort1(int n, List<Integer> arr) {
        int s = arr.get(n-1);
        arr = arr.subList(0, n-1);
        int i=arr.size()-1;
        while(true){
            if(i==-1){
                for (int j: arr.subList(0, i+1)) System.out.print(j+" ");
                System.out.print(s+" ");
                for (int j: arr.subList(i+1, arr.size())) System.out.print(j+" ");
                break;
            } else if(arr.get(i)<=s){
                for (int j: arr.subList(0, i+1)) System.out.print(j+" ");
                System.out.print(s+" ");
                for (int j: arr.subList(i+1, arr.size())) System.out.print(j+" ");
                break;
            } else if (arr.get(i)>s){
                for (int j: arr.subList(0, i+1)) System.out.print(j+" ");
                System.out.print(arr.get(i)+" ");
                for (int j: arr.subList(i+1, arr.size())) System.out.print(j+" ");
                System.out.print('\n');
                i--;
            }
            
        }
    }

}
