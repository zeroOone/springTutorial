package spring.IoC;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import spring.firstSpring.HelloSpring;

/**
 * Spring容器有两种 ：
 *                      1 ： BeanFactory， 应用场景在轻量级任务中，不过依旧建议使用第二种
 *                      2 ： ApplicationContext， 除了拥有BeanFactory所有功能，还额外提供了企业需要的功能
 * BeanFactory只做一般了解；
 */
public class BeanFactoryContainer {
    public static void main(String[] args) {
        //这些横线代表官方不建议使用该API
        XmlBeanFactory factory = new XmlBeanFactory(new ClassPathResource("Beans.xml"));

        HelloSpring obj = (HelloSpring) factory.getBean("HelloWorld");
        obj.getMessage();
    }
}
