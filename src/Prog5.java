public class Prog5 {
    public static void main(String[] args) {
        Prog5 prog = new Prog5();
        int[] a = {5, 6, -4, 3, 1};
        int[] b = {3, 8, 9, 11};
        int[] combinedArray = prog.combine(a, b);
        System.out.print("Output array: ");
        prog.printArray(combinedArray);
    }

    public  int[] combine(int[] a, int[] b) {
        int lenA = a.length;
        int lenB = b.length;
        int[] result = new int[lenA + lenB];
        System.arraycopy(a, 0, result, 0, lenA);
        System.arraycopy(b, 0, result, lenA, lenB);
        return result;
    }
    private  void printArray(int[] arr) {
        System.out.print("[ ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println("]");
    }
}
