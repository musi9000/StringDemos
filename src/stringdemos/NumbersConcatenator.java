package stringdemos;

import java.util.Date;

/**
 *
 * @author mustafa
 */
public class NumbersConcatenator {

    public static void main(String[] args) {
        System.out.println(new Date());
        String collector = "Numbers: ";
        for (int idx = 1; idx <= 50000; idx++) {
            collector += idx;
        }

        System.out.println(collector.substring(0, 1024));
        System.out.println(new Date());
    }
}
