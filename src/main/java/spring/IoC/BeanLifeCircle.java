package spring.IoC;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring.firstSpring.HelloSpring;

public class BeanLifeCircle{

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");

        //默认方法
        HelloSpring obj1 = (HelloSpring) context.getBean("lifeCircleDefault");
        obj1.getMessage();
        //如果不调用该方法，那么destroy不会被调用
        ((ClassPathXmlApplicationContext) context).registerShutdownHook();

        //客制化出示与销毁方法
        HelloSpring obj2 = (HelloSpring) context.getBean("lifeCircleCreated");
        obj2.getMessage();
        ((ClassPathXmlApplicationContext) context).registerShutdownHook();
        /**
         * 通过这个例子，还可以看出，beans对象是在容器中统一初始化的，当被需要的时候，直接分配，
         * 销毁的时候，也是一并销毁。
         * 不存在只初始化或者销毁其中一个bean的用法；
         * 这里突出了BeanFactory的一个优点，就是对bean对象的统一管理
         */
    }

}
