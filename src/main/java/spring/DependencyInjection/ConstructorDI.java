package spring.DependencyInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConstructorDI {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        TextEditor textEditor = (TextEditor) context.getBean("textEditor");
        textEditor.spellCheck();
    }
}

class TextEditor {
    private SpellChecker spellChecker;

    //构造函数注入
    //如果这里有多个参数，那么需要在Beans.xml中，按照顺序定义<constructor-arg ref="" />
    public TextEditor(SpellChecker spellChecker) {
        System.out.println("Inside TextEidtor Constructor.");
        this.spellChecker = spellChecker;
    }

    public void spellCheck() {
        spellChecker.checkSpelling();
    }
}

class SpellChecker {

    public SpellChecker() {
        System.out.println("Inside checkSpelling.");
    }

    public void checkSpelling() {
        System.out.println("Inside checkSpelling.");
    }
}
