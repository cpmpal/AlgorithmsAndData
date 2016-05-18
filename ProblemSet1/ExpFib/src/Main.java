/** main class */
public class Main {
    /** exponential fibonacci */
    public static long exponentialFibonacci(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        return Main.exponentialFibonacci(n - 2) + exponentialFibonacci(n - 1);
    }
    /** main */
    public static void main(String[] args) {
        if (args.length > 0) {
            int n = new Integer(args[0]);
            long prev = System.nanoTime();
            long toBePrinted = Main.exponentialFibonacci(n);
            System.out.println(
                    java.time.Duration.ofNanos(System.nanoTime() - prev));
            System.out.println(toBePrinted);
        }
        else {
            throw new RuntimeException("wrong input");
        }
    }
}