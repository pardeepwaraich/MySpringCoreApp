package trng.imcs.spring.beans;


public class AdvSpellChecker implements ISpellChecker {
    public boolean check(String word) {
        System.out.println("Advanced spell checker called");
        return true;
    }
}
