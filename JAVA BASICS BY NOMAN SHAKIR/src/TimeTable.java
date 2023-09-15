public class TimeTable {
    public static void main(String[] args) {
        String[][] timetable = new String[7][7]; // 7 days, 7 periods

        // Fill in the timetable with some sample events
        timetable[0][0] = "Math";
        timetable[1][2] = "History";
        timetable[2][1] = "Science";
        timetable[3][3] = "English";

        // Display the timetable
        System.out.println("Time Table:");
        for (int day = 0; day < 7; day++) {
            System.out.println("Day " + (day + 1) + ":");
            for (int period = 0; period < 7; period++) {
                String event = timetable[day][period];
                if (event != null) {
                    System.out.println("Period " + (period + 1) + ": " + event);
                }
            }
            System.out.println();
        }
    }
}
