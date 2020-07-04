import java.util.Calendar;
import java.util.Date;

public class DatesNCalendar {

    public static void main(String[] args) {

        // Main difference between number and date formatting is that date formats
        // use a two-character type that starts with "t"

        // complete date and time "&tc"
        String s = String.format("%tc", new Date());
        System.out.println(s);

        // just the time "%tr"
        String a = String.format("%tr", new Date());
        System.out.println(a);

        Date today = new Date();
        // day of the week, month and day "%tA" , "%tB" , "%td"
        String p = String.format("%tA, %tB, %td", today, today, today);
        System.out.println(p);

        // same as above but without duplicating the arguments
        // the angle brackets "<" is a flag that tells the formatter to use previous argument
        // again. Saves you from repeating the arguments
        p = String.format("%tA, %<tB, %<td", today);
        System.out.println(p);

        System.out.println();
        System.out.println();

        // Examples of working with a Calendar object
        Calendar c = Calendar.getInstance();
        // set time to Jan 7, 2004 at 15:40. Notice the month is zero based
        c.set(2004,0,7,15,40);
        System.out.println("Date: " + c.getTime());
        // convert to amount of milliseconds
        long day1 = c.getTimeInMillis();
        // add an hours worth of millis, then update the time
        day1 += 1000 * 60 * 60;
        c.setTimeInMillis(day1);
        System.out.println("new hour: " + c.get(c.HOUR_OF_DAY));
        // add 35 days onto this date. Which should move us into Feb
        c.add(c.DATE, 35);
        System.out.println("add 35 days: " + c.getTime());
        // "Roll" 35 days onto this date. This "rolls" the date ahead 35 days but does not change the month!
        c.roll(c.DATE, 35);
        System.out.println("roll 35 days: " + c.getTime());
        // not incrementing just doing a "set" of the date
        c.set(c.DATE, 1);
        System.out.println("set to 1: " + c.getTime());





    }
}
