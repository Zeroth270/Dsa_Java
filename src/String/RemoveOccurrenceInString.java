package String;

public class RemoveOccurrenceInString {

    static String removeOccurrence(String s, String part){

        while(s.contains(part)){
            int index = s.indexOf(part);
            s = s.substring(0, index) + s.substring(index + part.length());
        }
        return s;

    }

    static void main(){
        String s = "tabxabyabz";
        String part = "ab";
        String ans = removeOccurrence(s, part);
        System.out.println(ans);

    }

}
