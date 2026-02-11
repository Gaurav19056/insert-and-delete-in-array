public class RemoveVowelsFromString {
    public static String removeVowels(String text) {
        String vowels="aeiou";
        String newtext="";
        int i;
        for(i=0;i<text.length();i++){
            char currentChar=text.charAt(i);
            if(!vowels.contains(String.valueOf(currentChar))){
                newtext +=currentChar;
            }
        }
        return newtext;
    }
    public static void main(String[] args) {
        System.out.println("\"hello\" → " + removeVowels("hello"));       // "hll"
        System.out.println("\"apple pie\" → " + removeVowels("apple pie"));// "ppl p"
        System.out.println("\"HELLO\" → " + removeVowels("HELLO"));       // "HELLO"
        System.out.println("\"aeiou\" → " + removeVowels("aeiou"));       // ""
        System.out.println("\"\" → " + removeVowels(""));                 // ""
    }
}

