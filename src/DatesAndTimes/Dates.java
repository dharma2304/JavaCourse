package DatesAndTimes;

import java.util.Date;

public class Dates {
    public static void main(String args[]){
        /*

          Date: In java there is a date class which returns the current time .
         */

        // Creation of date object using 2 constructors

        // 1. empty constructor
        Date date = new Date();
        System.out.println("Current date is :"+ " "+ date);

        // 2. constructor with milliseconds  value.
        // Creates a date object for the given milliseconds since January 1, 1970, 00:00:00 GMT.
        Date date1 = new Date(2323223232L);
        System.out.println(date1);



        // Methods

        // 1. after(Date date): This method is used to test the current date is after the given date
        System.out.println("After the given date: "+" "+date1.after(date));

        // 2. before(Date date): This method is used to test the current date is before the given date.
        System.out.println("Before the given date: "+" "+ date1.before(date));

        /*
        3. compareTo(Date date): Compares current date with given date. Returns 0 if the argument Date is equal to the Date, value less than 0 if the Date is before the Date argument;
                                 and a value greater than 0 if the Date is after the Date argument.

       */
        int c = date1.compareTo(date);
        System.out.println("Compare the dates values: "+" "+c);

        // 4. getTime(): Returns the number of milliseconds since January 1, 1970, 00:00:00 GMT represented by this Date object.
        System.out.println("Get time in milliseconds:"+ " "+date.getTime());



    }
}
