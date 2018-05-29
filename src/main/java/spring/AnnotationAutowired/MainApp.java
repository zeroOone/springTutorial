package spring.AnnotationAutowired;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("AnnotationBeans.xml");
        TextEditor textEditor = (TextEditor) ctx.getBean("autowiredAnnotation");
        //TextEditor textEditor1 = (TextEditor) ctx.getBean("autowiredAnnotation2");
        textEditor.spellCheck();
       // textEditor1.spellCheck();
    }
}
