import algorithmTest.FlexibleWork;
import algorithmTest.Pcce_10;
import algorithmTest.Pcce_9;

public class Main {
    public static void main(String[] args) {
        FlexibleWork flexibleWork = new FlexibleWork();
        int[] schedules = {700, 800, 1100};
        int[][] timelogs = {{710, 2359, 1050, 700, 650, 631, 659},{800, 801, 805, 800, 759, 810, 809},{1105, 1001, 1002, 600, 1059, 1001, 1100}};
        int result = flexibleWork.flex(schedules, timelogs, 5);

        System.out.println("result =====>" + result);
    }
}
