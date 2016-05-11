package examples;

/**
 *
 * @author mustafa
 */
public class Forbidden {

    public static void replaceForbiddenWords(String s, String words) {
        
        String[] wordsArr = words.split(",");
        
        StringBuilder sb = new StringBuilder();
        
        sb = sb.append(s);

        for (int i = 0; i < wordsArr.length; i++) {
            
            int index = s.indexOf(wordsArr[i]);
            StringBuilder forbiddenWord = new StringBuilder();
            
            for (int j = 0; j < wordsArr[i].length(); j++) {
                
                forbiddenWord.append('*');

            }

            while (index != -1) {
                sb.replace(index, index + wordsArr[i].length(), forbiddenWord.toString());
                s = sb.toString();
                index = s.indexOf(wordsArr[i], index + 1);
            }

        }
        System.out.println(sb);
    }

    public static void main(String[] args) {
        String words = "Java,JVM,Microsoft";

        replaceForbiddenWords("Microsoft announced its next generation Java compiler today.\n"
                + "It uses advanced parser and special optimizer for the\n"
                + "Microsoft JVM.", words);
    }
}
