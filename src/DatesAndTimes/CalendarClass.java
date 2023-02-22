package DatesAndTimes;

import java.util.Calendar;

public class CalendarClass {
    public static void main(String args[]){
        /*
          Calendar: Calendar is class to get the current date and time like Date class.
         */

        // Instantiating the calendar class
        Calendar cal = Calendar.getInstance();
        System.out.println("created calendar: "+" "+cal);

        // Some important values in calendar instance

        // 1. Day of week: This returns the day of the that week.
        System.out.println("DAY OF THE WEEK: "+" "+cal.get(Calendar.DAY_OF_WEEK));

        // 2. Day of month: This returns the day of the year
        System.out.println("DAY OF THE MONTH: "+" "+cal.get(Calendar.DAY_OF_MONTH));

        // 3. Day of year: This returns the day of the year
        System.out.println("DAY OF THE YEAR: "+" "+cal.get(Calendar.DAY_OF_YEAR));

        // 4. Week of month: This returns the which week of the month
        System.out.println("WEEK OF MONTH: "+" "+cal.get(Calendar.WEEK_OF_MONTH));

        // 5. Week of Year: This returns the which week of the year
        System.out.println("WEEK OF YEAR: "+" "+cal.get(Calendar.WEEK_OF_YEAR));

        // 6. Day of week in month: This returns the day of the week in the month
        System.out.println("DAY OF THE WEEK IN THE MONTH: "+" "+cal.get(Calendar.DAY_OF_WEEK_IN_MONTH));

        // 7. hour: This returns which hour of the day
        System.out.println("HOUR: "+" "+cal.get(Calendar.HOUR));

        // 8. Minute: This returns the minute of the hour
        System.out.println("MINUTE: "+" "+cal.get(Calendar.MINUTE));

        // 9. Second: This returns the second of the minute
        System.out.println("SECOND: "+" "+cal.get(Calendar.SECOND));

        // 10. AM_PM: This returns the AM or PM of the day
        System.out.println("AM OR PM: "+" "+ cal.get(Calendar.AM_PM));

        // 11. Hour of the day: This returns the hour of the day
        System.out.println("HOUR OF THE DAY: "+" "+ cal.get(Calendar.HOUR_OF_DAY));

    }
}