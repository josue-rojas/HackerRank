import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the hourglassSum function below.
    static int hourglassSum(int[][] arr) {
      int maxSum = Integer.MAX_VALUE + 1;
      // lengths are assumning they are constant, more specifically the col_length, they are there for better understand the code
      int row_length = arr.length;
      int col_length = arr[0].length;
      // the last 2 rows dont matter cause there is no hourglass pattern so we skip them
      for(int row = 0; row < row_length-2; row++){
        // similarly the last 2 columns dont make an hourglass pattern so we skip them
        for(int col = 0; col < col_length-2; col++){
          // the pattern of hourglass is as follow
          int firstRow = arr[row][col] + arr[row][col+1] + arr[row][col+2];
          int secRow = arr[row+1][col+1];
          int thirdRow = arr[row+2][col] + arr[row+2][col+1] + arr[row+2][col+2];
          int hourglassTotal = firstRow + secRow + thirdRow;
          if(hourglassTotal > maxSum) maxSum = hourglassTotal;
        }
      }
      return maxSum;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }

        int result = hourglassSum(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
