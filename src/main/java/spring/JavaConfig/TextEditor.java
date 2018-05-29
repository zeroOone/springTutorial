package spring.JavaConfig;

import javax.swing.text.html.HTMLDocument;

public class TextEditor {
    private SpellChecker spellChecker;

    public TextEditor(SpellChecker spellChecker) {
        System.out.println();
        this.spellChecker = spellChecker;
    }

    public void spellChecker() {
        spellChecker.checkSpelling();
    }
}
