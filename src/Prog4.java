public class Prog4 {
    public static void main(String[] args) {
        float sum = 1.27f + 3.881f + 9.6f;
        int castingSum = (int)sum;
        int roundSum = Math.round(sum);
        System.out.println("Cast of Sum: " + castingSum);
        System.out.println("Rounded: " + roundSum);
    }
}
