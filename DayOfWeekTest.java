/*
 * 4 a . Create an enumeration Day of Week with seven values SUNDAY through SATURDAY. Add a
method Workday() to the DayofWeek class that returns true if the value on which it is called is MONDAY
through FRIDAY.
*/
public class DayOfWeekTest {
    public enum DayOfWeek {
        SUNDAY,
        MONDAY,
        TUESDAY,
        WEDNESDAY,
        THURSDAY,
        FRIDAY,
        SATURDAY;

        // Method to check if the day is a workday (Monday to Friday)
        public boolean isWorkday() {
            return (this != SATURDAY && this != SUNDAY);
        }
    }

    public static void main(String[] args) {
        // Check if Monday is a workday
        System.out.println("Is Monday a workday? " + DayOfWeek.MONDAY.isWorkday());
        // Check if Saturday is a workday
        System.out.println("Is Saturday a workday? " + DayOfWeek.SATURDAY.isWorkday());
    }
}
