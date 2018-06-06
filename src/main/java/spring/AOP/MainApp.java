package spring.AOP;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("Beans.xml");
        Student student = (Student) ctx.getBean("studentAop");
        student.getName();
        student.getAge();
        student.printThrowException();
    }
}
