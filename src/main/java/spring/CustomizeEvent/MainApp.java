package spring.CustomizeEvent;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main (String[] args) {
        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("AnnotationBeans.xml");
        MyCustomEventPublisher mcvp = (MyCustomEventPublisher) context.getBean("myCustomEventPublisher");
        mcvp.publish();
        mcvp.publish();
    }
}
