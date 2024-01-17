import java.util.Arrays;

public class Prog3 {
    public static String[] removeDups(String[] arr) {
        if(arr==null  || arr.length == 0){
            return new String[0];
        }
        StringBuilder resultBuilder = new StringBuilder();
        for (String str: arr) {
            if (resultBuilder.indexOf(str) == -1){
                resultBuilder.append(str).append(",");
            }
        }
        String[] result = resultBuilder.toString().split(",");
        return Arrays.copyOf(result, result.length );

        }
    public static void main(String[] args) {
        String[] arr = {"horse", "dog", "cat", "horse", "dog"};
        String[] result = removeDups(arr);
        System.out.println(Arrays.toString(result));
    }


}
