package stringdemos;

import java.util.Scanner;

/**
 * @author mustafa
 */
public class StringDemos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String greeting = "Hello, Java";

        String msg = "Stand up, stand up, Balkan superman.";
        System.out.printf("msg = \"%s\"%n", msg);
        System.out.printf("msg.length() = %d%n", msg.length());
        for (int i = 0; i < msg.length(); i++) {
            System.out.printf("msg[%d] = %c%n", i, msg.charAt(i));
        }

        String quote = "Book’s title is \"Intro to Java\"";

        Scanner input = new Scanner(System.in);
        String name = input.nextLine();

        System.out.println("Your name is: " + name);

        String word1 = "Java";
        String word2 = "JAVA";
        System.out.println(word1.equals(word2)); // false
        System.out.println(word1.equalsIgnoreCase(word2)); // true

        String score = "sCore";
        String scary = "scary";
        System.out.println(score.compareToIgnoreCase(scary)); // 14
        System.out.println(scary.compareToIgnoreCase(score)); // -14
        System.out.println(scary.compareTo(score)); // 32

        String greet = "Hello, ";
        String nametwo = "reader!";
        String result = greet.concat(nametwo);

        result += " How are you?";

        msg = "The number of the beast is: ";
        int beastNum = 666;
        result = msg + beastNum;
// The number of the beast is: 666

    }

}
