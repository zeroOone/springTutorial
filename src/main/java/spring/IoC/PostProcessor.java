package spring.IoC;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring.firstSpring.HelloSpring;

public class PostProcessor implements BeanPostProcessor {

    @Override
    public Object postProcessAfterInitialization(Object o, String s) throws BeansException {
        System.out.println("AfterPostInitialization");
        return o;
    }

    @Override
    public Object postProcessBeforeInitialization(Object o, String s) throws BeansException {
        System.out.println("BeforeInitialization : " + s);
        return o;
    }

    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        HelloSpring obj1 = (HelloSpring) context.getBean("HelloWorld");
        obj1.getMessage();
        context.registerShutdownHook();
    }
}
