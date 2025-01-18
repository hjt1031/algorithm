import algorithmTest.Pcce_10;
import algorithmTest.Pcce_9;

public class Main {
    public static void main(String[] args) {
//        Pcce_9 pcce9 = new Pcce_9();
//        System.out.println("solutions.solution Result: " + pcce9.pcce_9(new int[]{50, 50}, new int[]{100, 241}));

        Pcce_10 pcce10 = new Pcce_10();
        System.out.println(pcce10.pcce_10(new int[]{3, 5, 2}, new String[][]{
                  {"A", "A", "-1", "B", "B", "B", "B", "-1"}
                , {"A", "A", "-1", "B", "B", "B", "B", "-1"}
                , {"-1", "-1", "-1", "-1", "-1", "-1", "-1", "-1"}
                , {"D", "D", "-1", "-1", "-1", "-1", "E", "-1"}
                , {"D", "D", "-1", "-1", "-1", "-1", "-1", "F"}
                , {"D", "D", "-1", "-1", "-1", "-1", "E", "-1"}}));
    }
}
