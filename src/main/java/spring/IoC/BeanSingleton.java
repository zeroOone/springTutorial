package spring.IoC;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring.firstSpring.HelloSpring;

/**
 * bean作用域 ： 单例模式
 */
public class BeanSingleton {
    public static void main(String[] args) {
        /**
         * STEP 1 ：
         * 先创建两个实例并输出
         */
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        HelloSpring obj1 = (HelloSpring) context.getBean("singletonScope");
        obj1.getMessage();
        HelloSpring obj2 = (HelloSpring) context.getBean("singletonScope");
        obj2.getMessage();

        /**
         * STEP 2 :
         * 单例模式，仅存在一个Bean，那么通过更改obj2，然后输出obj1，会发现obj1也会改变
         * 这就是单例模式
         */
        obj2.setMessage("I'm Object2.");
        obj2.getMessage();
        obj1.getMessage();

        // 单例模式中，只有一个bean对象，obj1和obj2共享，所以这里输出TRUE
        System.out.println(obj1 == obj2 ? "TRUE":"FALSE");
    }
}
