package examples;

/**
 *
 * @author mustafa
 */
public class UpCase {

    /**
     * @param args the command line arguments
     */
    public static void upperCase(String s) {
        StringBuilder sb = new StringBuilder();
        sb = sb.append(s);
        int openTagIndex = s.indexOf("<upcase>");
        int closeTagIndex = s.indexOf("</upcase>");
        int count = 0;

        while (openTagIndex != -1) {
            sb.replace(openTagIndex, closeTagIndex + 9, s.substring(openTagIndex + 8, closeTagIndex).toUpperCase());
            s = sb.toString();

            openTagIndex = s.indexOf("<upcase>", openTagIndex + 1);

            closeTagIndex = s.indexOf("</upcase>", closeTagIndex + 1);

            count++;

        }

        System.out.println(sb);

    }

    public static void main(String[] args) {
        upperCase("We are living in a <upcase>yellow submarine</upcase>. We\n"
                + "don't have <upcase>anything</upcase> else.");
    }
}
