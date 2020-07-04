public class NumberFormatting {

    public static void main(String[] args) {

        /* Formatting consists of two main parts: formatting instructions
         *  and the argument to be formatted*/
        String s = String.format("%, d", 1000000);
        String k = String.format("I have %.2f bugs to fix.", 4765.0987);
        String m = String.format("I have %,.2f bugs to fix.", 4765.0987);
        String p = String.format("I have %.2f, bugs to fix.", 4765.0987);

        System.out.println(s);
        System.out.println(k);
        System.out.println(m);
        System.out.println(p);

        /* The Rules
         *  %,d  means insert commas and format the number as a decimal integer
         *  %.2f means format the number as floating point with a precision of 2 decimal places
         *  %,2f means insert commas and format the num as a floating point with same precision as above
         * */

        int one = 20456654;
        double two = 83847294;

        // when you have more than one argument
        String x = String.format("The rank is %,d out of %,.2f", one, two);
        System.out.printf(x);

    }
}