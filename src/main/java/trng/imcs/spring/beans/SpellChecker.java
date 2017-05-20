package trng.imcs.spring.beans;

import java.util.List;

public class SpellChecker implements ISpellChecker {

    private List<String> words;
//    private List<Integer> numbers;

    /*public boolean check(String word) {
        if ("Hi".equalsIgnoreCase(word) || "Hello".equalsIgnoreCase(word)) {
            return true;
        }
        return false;
    }*/

    public boolean check(String word) {
        System.out.println("Simple spell checker called");
        if (words.contains(word)) {
            return true;
        }

        return false;
    }

    public void setWords(List<String> words) {
        this.words = words;
    }
}
