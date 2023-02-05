package Enum;

enum Days{
    SUNDAY,
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY;
}
public class Enum {
    public static void main(String args[]){
        /*
          Enum: Enum is nothing but a collection of pre-defined constants. Enums are named constants which represents a group.
          For Example days of week is group and days(sunday, monday, etc) are constants.
          enums are represented using enum data type. We can also add variables , methods, constructors in an enum.
          We can declare an enum inside a class and outside a class but not inside a method.

         */
        Days days = Days.SUNDAY;
        switch (days){
            case SUNDAY:
                System.out.println(Days.SUNDAY);
                break;
            case MONDAY:
                System.out.println(Days.MONDAY);
                break;
            case TUESDAY:
                System.out.println(Days.TUESDAY);
                break;
            case WEDNESDAY:
                System.out.println(Days.WEDNESDAY);
                break;
            case THURSDAY:
                System.out.println(Days.THURSDAY);
                break;
            case FRIDAY:
                System.out.println(Days.FRIDAY);
                break;
            case SATURDAY:
                System.out.println(Days.SATURDAY);
                break;
            default:
                System.out.println("You have entered a wrong day");

        }

    }
}
