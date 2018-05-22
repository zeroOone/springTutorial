package spring.IoC;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring.firstSpring.HelloSpring;

/**
 * Bean作用域 ： 原型模式
 * 每一次getBean都是返回一个新的对象
 */
public class BeanPrototype {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        HelloSpring obj1 = (HelloSpring) context.getBean("prototypeScope");
        obj1.getMessage();

        HelloSpring obj2 = (HelloSpring) context.getBean("prototypeScope");
        obj2.getMessage();

        obj2.setMessage("prototypeScope : obj2 changed.");
        obj2.getMessage();
        obj1.getMessage();

        //原型模式中，obj1和obj2是两个不同的bean对象，所以返回的值应该是FALSE
        System.out.println(obj1 == obj2 ? "TRUE" : "FALSE");
    }
}
