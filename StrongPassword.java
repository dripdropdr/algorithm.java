class Result {

    /*
     * The 'Strong Password' problem from HackerRank. 
     * https://www.hackerrank.com/challenges/strong-password/problem
     *
     * Complete the 'minimumNumber' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. STRING password
     */

    public static int minimumNumber(int n, String password) {
    // Return the minimum number of characters to make the password strong
    int minNum = 0;
      
      Pattern p1 = Pattern.compile("[0-9]");
      int isContainDigit = p1.matcher(password).find() ? 0 : 1;
      minNum += isContainDigit;

      Pattern p2 = Pattern.compile("[a-z]");
      int isContainLowerCase = p2.matcher(password).find() ? 0 : 1;
      minNum += isContainLowerCase;

      Pattern p3 = Pattern.compile("[A-Z]");
      int isContainUpperCase = p3.matcher(password).find() ? 0 : 1;
      minNum += isContainUpperCase;

      Pattern p4 = Pattern.compile("[!@#$%^&*()-+ ]");
      int isContainSpecialChar = p4.matcher(password).find() ? 0 : 1;
      minNum += isContainSpecialChar;
      
      if (6 - n >= minNum){
          return 6 - n;
      } else{
          return minNum;
      }

    }

}
