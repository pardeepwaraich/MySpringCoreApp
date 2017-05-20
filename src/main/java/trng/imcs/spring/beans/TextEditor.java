package trng.imcs.spring.beans;


public class TextEditor {

    private ISpellChecker spellChecker;

    public TextEditor(ISpellChecker spellChecker) {
        this.spellChecker = spellChecker;
    }

    public boolean checkSpelling(String line) {
        String[] words = line.split(" ");
        for(String word : words) {
            if (! spellChecker.check(word)) {
                return false;
            }
        }

        return true;
    }

/*    public void setSpellChecker(ISpellChecker spellChecker) {
        this.spellChecker = spellChecker;
    }*/
}
