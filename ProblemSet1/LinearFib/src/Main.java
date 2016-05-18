/** main class */
public class Main {
    /** linear fibonacci */
    public static long linearFibonacci(int n) {
        long currentFib = 0;
        long nextFib = 1;
        for (int i = 0; i < n; i++) {
            long lastFib = currentFib;
            currentFib = nextFib;
            nextFib = lastFib + currentFib;
        }
        return currentFib;
    }
    /** main */
    public static void main(String[] args) {
        if (args.length > 0) {
            int n = new Integer(args[0]);
            long prev = System.nanoTime();
            long toBePrinted = Main.linearFibonacci(n);
            System.out.println(
                    java.time.Duration.ofNanos(System.nanoTime() - prev));
            System.out.println(toBePrinted);
        }
        else {
            throw new RuntimeException("wrong input");
        }
    }
}