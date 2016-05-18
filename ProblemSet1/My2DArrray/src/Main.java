import java.util.Random;

/** main class */
public class Main {
    /** make 2D array of size n x n containing random numbers */
    public static int[][] make2DArray(int n) {
        Random rng = new Random();
        int[][] my2DArray = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                my2DArray[i][j] = rng.nextInt(10);
            }
        }
        return my2DArray;
    }
    /** sum all values in that 2D Array */
    public static int sumMy2DArray(int[][] my2DArray) {
        int currentSum = 0;
        for (int[] listOfInt : my2DArray) {
            for (int Int : listOfInt) {
                // System.out.println(Int);
                currentSum = currentSum + Int;
            }
        }
        return currentSum;
    }
    /** main */
    public static void main(String[] args) {
        int arrayLength = new Integer(args[0]);
        int[][] my2DArray = Main.make2DArray(arrayLength);
        // System.out.println(Main.sumMy2DArray(my2DArray));
        long prev = System.nanoTime();
        int toBePrinted = Main.sumMy2DArray(my2DArray);
        System.out.println(
                java.time.Duration.ofNanos(System.nanoTime() - prev));
        System.out.println(toBePrinted);
    }
}