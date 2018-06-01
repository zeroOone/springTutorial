package spring.SpringEvent;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("AnnotationBeans.xml");

        //启动一个开始事件
        context.start();

        HelloWorld obj = (HelloWorld) context.getBean("helloEvent");

        obj.getMessage();

        //启东一个关闭事件
        context.stop();
    }
}
