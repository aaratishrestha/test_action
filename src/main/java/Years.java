
//import java.lang.constant.Constable;
public class Years {

    // the year is leap year if it is divisible by 4 / the last 2 digits are divisible  by 4
    // leap year has 366 days
    // leap year arrives after every four years
    // centurial years are leap years is they are divisible by 400

    // -----------------------------------------------------------------------

    // the year is not leap year if the number is not divisible by 4
    // if a year is not divisible by 400, but it is divisible by 100 then it is not a leap year

    // year to be checked

    public static boolean boolisLeapYear(int year) {

        // the year is leap year if it is divisible by 4
        // the year is not leap year if the number is not divisible by 4
        // if a year is not divisible by 400, but it is divisible by 100 then it is not a leap year
        if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {


            System.out.println(year + ": is a Leap year.");
            return true;
        } else {
        }

        System.out.println(year + ": is Not a leap year.");


        return false;

    }


}
















