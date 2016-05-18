import java.util.Random;

/** main class */
public class Main {
    /** sort list by putting each element in the right place */
    public static int[] insertionSort(int[] toBeSorted) {
        for (int i = 1; i < toBeSorted.length; i++) {
            int toBeInserted = toBeSorted[i];
            int j = i - 1;
            while (j >= 0 && toBeSorted[j] > toBeInserted) {
                toBeSorted[j + 1] = toBeSorted[j];
                j--;
            }
            toBeSorted[j + 1] = toBeInserted;
        }
        return toBeSorted;
    }
    /** make a random-case scenario for insertion sort on array of length n */
    public static int[] makeRandomCase(int n) {
        Random rng = new Random();
        int[] randomCase = new int[n];
        for (int i = 0; i < n; i++) {
            randomCase[i] = rng.nextInt(n);
        }
        return randomCase;
    }
    /** print array elements */
    public static void printElements(int[] array) {
        System.out.print("[ ");
        for (int i = 0; i < array.length; i++) {
            if (i == array.length - 1) {
                System.out.print(array[i]);
            }
            else {
                System.out.print(array[i] + ", ");
            }
        }
        System.out.println(" ]");
    }
    /** main */
    public static void main(String[] args) {
        int arrayLength = new Integer(args[0]);
        int[] toBeSorted = Main.makeRandomCase(arrayLength);
        // Main.printElements(toBeSorted);
        // Main.printElements(Main.insertionSort(toBeSorted));
        long prev = System.nanoTime();
        int[] toBePrinted = Main.insertionSort(toBeSorted);
        System.out.println(
                java.time.Duration.ofNanos(System.nanoTime() - prev));
        Main.printElements(toBePrinted);
    }
}