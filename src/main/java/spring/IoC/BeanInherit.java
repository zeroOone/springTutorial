package spring.IoC;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring.firstSpring.HelloSpring;

public class BeanInherit {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");

        HelloSpring obj1 = (HelloSpring)context.getBean("HelloWorld");

        obj1.getMessage();
        obj1.getMessage2();

        HelloSon son = (HelloSon) context.getBean("son");
        son.getMessage();
        son.getMessage2();
        son.getMessage3();
    }
}
