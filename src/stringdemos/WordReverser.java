package stringdemos;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.text.*;

/**
 *
 * @author mustafa
 */
public class WordReverser {

    public static void main(String[] args) {
        String text = "EM edit";
        String reversed = reverseText(text);
        System.out.println(reversed); // tide ME

        StringBuilder s = new StringBuilder(12);
        System.out.println(s.capacity());

        System.out.print(extractCapitals("CameLCasE"));

        String texttwo = "53";
        int intValue = Integer.parseInt(texttwo);

        String textthree = "True";
        Boolean boolValue = Boolean.parseBoolean(text);

        String textfour = "27.10.2008";
        String[] dateElements = textfour.split("[.]");
        String dayString = dateElements[0];
        String monthString = dateElements[1];
        String yearString = dateElements[2];
        int day = Integer.parseInt(dayString);
        int month = Integer.parseInt(monthString);
        int year = Integer.parseInt(yearString);
        Calendar cal = new GregorianCalendar(year, month - 1, day);
        java.util.Date date = cal.getTime(); // Mon Oct 27 00:00:00 EET 2008

        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
        String userInput = "27/12/2008";
        try {
            java.util.Date date2 = sdf.parse(userInput);
            System.out.println(date2);
        } catch (ParseException pe) {
            System.out.println("Error in parsing " + userInput);
// Error in parsing 27/12/2008
        }

    }

    public static String reverseText(String text) {
        StringBuilder sb = new StringBuilder();
        for (int i = text.length() - 1; i >= 0; i--) {
            sb.append(text.charAt(i));
        }
        return sb.toString();
    }

    public static String extractCapitals(String s) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isUpperCase(ch)) {
                result.append(ch);
            }
        }
        return result.toString();
    }
}
