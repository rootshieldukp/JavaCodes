package basics.characterCode;

public class CharacterCheckForVowelOrConsonant {

    // character is a vowel or consonant

    public static boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch);
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U';
    }
    public static boolean isConsonant(char ch) {
        ch = Character.toLowerCase(ch);
        return (ch >= 'a' && ch <= 'z') && !isVowel(ch);



    }


}
