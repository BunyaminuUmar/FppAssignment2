public class Prog2 {
    public static void main(String[] args) {

    String myString = Data.records;
    String [] splitProducts = myString.split(":");

    for (String st : splitProducts) {
        System.out.println(st.split(",")[0]);
    }

    }

}
