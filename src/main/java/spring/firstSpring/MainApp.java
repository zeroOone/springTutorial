package spring.firstSpring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

    public static void main(String[] args) {
        //创建程序应用上下文。该API会加载Beans.xml配置文件，并处理创建并初始化所有对象（配置文件中的beans）
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");

        //使用getBean方法通过Bean Id获取bean，返回一个可用的通用对象给obj
        HelloSpring obj = (HelloSpring) context.getBean("HelloWorld");
        obj.getMessage();

        /**
         * 与如下代码等价 ：
         *                  HelloSpring obj = new HelloSpring();
         *                  obj.setMessage("Hello World");
         *                  obj.getMessage();
         */
    }
}
