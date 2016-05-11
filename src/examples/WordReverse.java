package examples;

/**
 *
 * @author mustafa
 */
public class WordReverse {

    public static void reverse(String s) {
        StringBuilder sb = new StringBuilder();
        String str[];
        str = s.split(" ");
        for (int i = str.length - 1; i >= 0; i--) {
            sb.append(str[i]);
            sb.append(" ");
        }
        System.out.printf("%s -> ",s);
        System.out.println(sb.toString());
    }

    public static void main(String[] args) {
        reverse("C# is not C++ and PHP is not Delphi");
    }

}
