package spring.Autowired;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("Beans.xml");
      //  TextEditor3 te = (TextEditor3) context.getBean("textEditor3");
       // te.spellCheck();

        //TextEditor3 te2 = (TextEditor3)context.getBean("textEditor4");
        //te2.spellCheck();

        TextEditor3 te3 = (TextEditor3)context.getBean("textEditor5");
        te3.spellCheck();

    }
}
