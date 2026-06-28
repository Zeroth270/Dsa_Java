package String;
import java.util.Collections;
import java.util.HashMap;

public class MostFreqVowelAndConsonant {
    static void main() {

        String s = "successes";

        HashMap<Character, Integer> vowel = new HashMap<>();
        HashMap<Character, Integer> con = new HashMap<>();


        for(int i=0 ; i<s.length() ; i++){
            if(s.charAt(i) == 'a' || s.charAt(i) == 'e' ||
                    s.charAt(i) == 'i' || s.charAt(i) == 'o' ||
                    s.charAt(i) == 'u'){
                vowel.put(s.charAt(i), vowel.getOrDefault(s.charAt(i), 0) + 1);
            }else{
                con.put(s.charAt(i), con.getOrDefault(s.charAt(i), 0) + 1);
            }
        }

        int vowelMax = Collections.max(vowel.values());
        int conMax = Collections.max(con.values());

        System.out.println(vowelMax + conMax);

    }
}
