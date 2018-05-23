package spring.DependencyInjection;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDI {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        TextEditor2 textEditor2 = (TextEditor2) context.getBean("textEditor2");
        textEditor2.spellCheck();
        //注入内部bean的方式
        TextEditor2 injectInnerBean = (TextEditor2) context.getBean("injectInnerBean");
        System.out.println("注入内部Bean的方式：");
        injectInnerBean.spellCheck();
    }

}

class TextEditor2 {
    private SpellChecker2 spellChecker2;

    public SpellChecker2 getSpellChecker2() {
        return spellChecker2;
    }

    public void setSpellChecker2(SpellChecker2 spellChecker2) {
        this.spellChecker2 = spellChecker2;
    }

    public void spellCheck() {
        spellChecker2.checkSpelling();
    }
}

class SpellChecker2 {
    public SpellChecker2() {
        System.out.println("Inside SpellChecker2 constructor");

    }

    public void checkSpelling() {
        System.out.println("Inside checkSpelling.");
    }
}
