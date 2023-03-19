package exercise;

import java.util.ArrayList;
import java.util.List;

class App {
    public static  boolean scrabble(String letters, String word) {
        List<Character> charsInWord = new ArrayList<>();
        for (int i = 0; i < letters.length(); i++) {
            charsInWord.add(Character.toLowerCase(letters.charAt(i)));
        }
        for (int i = 0; i < word.length(); i++) {
            if (charsInWord.contains(Character.toLowerCase(word.charAt(i)))) {
                charsInWord.remove(charsInWord.indexOf(Character.toLowerCase(word.charAt(i))));
            } else {
                return false;
            }
        }
        return  true;
    }
}
