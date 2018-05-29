package spring.AnnotationQualifier;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("AnnotationBeans.xml");
        Profile profile = (Profile) ctx.getBean("profile");

        profile.printAge();
        profile.printName();
    }
}
