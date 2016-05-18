import java.util.Arrays;

/** provides various methods for sorting arrays */
public final class Sort {
    /** to be sorted */
    private int[] list;
    /** construct Sort */
    public Sort(int[] list) {
        this.list = list;
    }
    /** get list[] */
    public final int[] getList() {
        return this.list;
    }
    /** does this Sort have exactly the same elements as that Sort? */
    public final boolean sameListElements(Sort that) {
        boolean helper = true;
        if (this.getList().length == that.getList().length) {
            for (int i = 0; i < this.getList().length; i++) {
                helper = helper && this.getList()[i] == that.getList()[i];
                if (i == this.getList().length - 1) {
                    System.out.println(this.getList()[i]);
                }
                else {
                    System.out.print(this.getList()[i] + ", ");
                }
            }
        }
        else {
            helper = false;
        }
        return helper;
    }
    /** sort list by sending min to front */
    public final Sort bubbleSort() {
        for (int i = 1; i < this.getList().length; i++) {
            for (int j = this.getList().length; j > i; j--) {
                if (this.getList()[j - 1] < this.getList()[j - 2]) {
                    int helper = this.getList()[j - 2];
                    this.getList()[j - 2] = this.getList()[j - 1];
                    this.getList()[j - 1] = helper;
                }
            }
        }
        return this;
    }
    /** sort list by putting each element in the right place */
    public final Sort insertionSort() {
        for (int j = 1; j < this.getList().length; j++) {
            int toBeInserted = this.getList()[j];
            int i = j - 1;
            while (i >= 0 && this.getList()[i] > toBeInserted) {
                this.getList()[i + 1] = this.getList()[i];
                i--;
            }
            this.getList()[i + 1] = toBeInserted;
        }
        return this;
    }
    /** sort list containing only numbers 1, 2, and 3 in linear time */
    public final Sort linear123Sort() {
        int k = 0;
        int j = this.getList().length - 1;
        for (int i = 0; i <= j; i++) {
            if (this.getList()[i] == 1) {
                int helper = this.getList()[k];
                this.getList()[k] = this.getList()[i];
                this.getList()[i] = helper;
                k++;
            }
            if (this.getList()[i] == 3) {
                int helper = this.getList()[j];
                this.getList()[j] = this.getList()[i];
                this.getList()[i] = helper;
                j--;
                i--;
            }
        }
        return this;
    }
    /** sort list via divide and conquer method */
    public final void quickSort() {
        Arrays.sort(this.getList());
    }
}