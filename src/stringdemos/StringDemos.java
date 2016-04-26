package stringdemos;

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
    }

}
