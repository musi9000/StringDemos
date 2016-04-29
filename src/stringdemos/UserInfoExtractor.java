package stringdemos;

/**
 *
 * @author mustafa
 */
public class UserInfoExtractor {

    public static void main(String[] args) {
        String firstName = "Svetlin";
        String lastName = "Nakov";
        String fullName = firstName + " " + lastName;
        System.out.println(fullName);
// Svetlin Nakov
        int age = 28;
        String nameAndAge = "Name: " + fullName + "\nAge: " + age;
        System.out.println(nameAndAge);
// Name: Svetlin Nakov
// Age: 28
        String book = "Introduction to Java book";
        int index = book.indexOf("Java");
        System.out.println(index); // index = 16

        String quote = "The main subject in the \"Intro Java\""
                + " book is Java for Java newbies.";
        index = quote.indexOf("Java");
        while (index != -1) {
            System.out.println("Java found on index: " + index);
            index = quote.indexOf("Java", index + 1);
        }

        String message = "MusTafa";
        message = message.toLowerCase();
        System.out.println(message);

        String path = "C:\\Pics\\Rila2008.jpg";
        String filename = path.substring(8, 16);
// filename = "Rila2008"
        index = path.lastIndexOf("\\"); // index = 7
        fullName = path.substring(index + 1);
// fullname = "Rila2008.jpg"
        String small = "[a-z]";
        String allLetters = "[a-zA-Zа-яА-Я]";
        String nan = "[^0-9]";

        String fileData = " \n\n Mario Peshev ";
        String reduced = fileData.trim();

        String str1 = "Super";
        String str2 = "Star";
        String result = str1 + str2;

    }
}
