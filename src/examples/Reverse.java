package examples;

/**
 *
 * @author mustafa
 */
public class Reverse {
    
    public static String reverse(String s){
        StringBuilder result = new StringBuilder();
        char ch;
        for(int i = s.length()-1; i >=0; i--){
            ch = s.charAt(i);
            result.append(ch);
        }
        
        return result.toString();
    }
    
    public static void main(String[] args) {
        System.out.println(reverse("introduction"));
    }
}
