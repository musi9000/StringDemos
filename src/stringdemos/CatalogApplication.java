package stringdemos;

/**
 *
 * @author mustafa
 */
public class CatalogApplication {

    public static void main(String[] args) {
        String catalog
                = "MicrowaveOven: 170, \n"
                + "AudioSystem: 125, \n"
                + "TV: 315, \n"
                + "Refrigerator: 400";
        System.out.println(catalog);
        /* MicrowaveOven: 170,
AudioSystem: 125,
TV: 315,
        Refrigerator: 400 */
        String[] products = catalog.split("[\\d\\s,:]+");
        for (String product : products) {
            System.out.print(product + " ");
        }
// MicrowaveOven AudioSystem TV Refrigerator
        System.out.println();
        String[] prices = catalog.split("\\D+");
        for (String price : prices) {
            System.out.print(price + " ");
        }

        String doc = "Hello, some@mail.bg, "
                + "you have been using some@mail.bg in your registration.";
        String fixedDoc = doc.replace("some@mail.bg", "osama@laden.af");
        System.out.println(fixedDoc);

        doc = "Smith's number: 0892880022 \n"
                + "Franky can be found at 0853445566 \n"
                + "so as Steven - 0811654321";
        String replacedDoc = doc.replaceAll("(08)[0-9]{8}", "$1********");
        System.out.println(replacedDoc);

        String text = "All Kind OF LeTTeRs";
        System.out.println(text.toLowerCase());
// all kind of letters

        String pass1 = "Parola";
        String pass2 = "PaRoLa";
        String pass3 = "parola";
        boolean isEqual;
        isEqual = pass1.toUpperCase().equals("PAROLA"); // true
        isEqual = pass2.toUpperCase().equals("PAROLA"); // true
        isEqual = pass3.toUpperCase().equals("PAROLA"); // true
    }
}
