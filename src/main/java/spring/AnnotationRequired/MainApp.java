package spring.AnnotationRequired;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        //使用基于注解的bean
        ApplicationContext ctx = new ClassPathXmlApplicationContext("AnnotationBeans.xml");
        Student student = (Student) ctx.getBean("requireAnnotation");
        System.out.println("Name : " + student.getName());
        System.out.print("Age: " + student.getAge());
    }
}
