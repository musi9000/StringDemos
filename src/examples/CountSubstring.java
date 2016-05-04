package examples;

/**
 *
 * @author mustafa
 */
public class CountSubstring {

    public static int countSubstring(String str, String searchedString) {
        int count = 0;
        String s = str.toLowerCase();
        String ss = searchedString.toLowerCase();
        int index = s.indexOf(ss);
        while (index != -1) {

            index = s.indexOf(ss, index + 1);
            count++;

        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(countSubstring("We are living In a yellow submarine. We don't have anything\n" +
"else. Inside the submarine is very tight. So we are drinking\n" +
"all the day. We will move out of it in 5 days.", "we"));
    }
}
