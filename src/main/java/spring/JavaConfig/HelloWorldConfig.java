package spring.JavaConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Configuration 表示该类可以使用Spring IOC容器作为bean定义的来源(可以理解为，HelloWorldConfig就是一个容器)
 * 该案例中的bean没有依赖关系
 *
 */
@Configuration
public class HelloWorldConfig {

    /**
     * @Bean注解相当于给使用bean标签定义bean，并通过name属性来定义id名;
     * 如果未使用bean的name属性，则id默认为返回对象名，即这里的HelloWorld;
     * @return
     */
   // @Bean(name = "bean1")
    //如果单单纯的使用@Bean，那么获取Beanid的时候，使用返回对象类型名，比如这里的HelloWorld
    @Bean
    public HelloWorld helloWorld() {
        return new HelloWorld();
    }
}
