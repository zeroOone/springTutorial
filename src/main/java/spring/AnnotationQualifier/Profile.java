package spring.AnnotationQualifier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

/**
 * Qualifier注解一般与Autowired注解共同使用；
 *
 * 作用 ： 在配置文件有多个相同bean定义的时候，可以通过@Qualifier("beanId")来指定要注入的bean；
 * 该例子中 ： 在AnnotationBeans.xml定义了多个student的bean
 */
public class Profile {

    @Autowired
    @Qualifier("student3")
    private Student student;

    public Profile() {
        System.out.println("Inside Profile constructor.");
    }

    public void printAge() {
        System.out.println("Age : " + student.getAge());
    }

    public void printName() {
        System.out.println("Name " + student.getName());
    }
}
