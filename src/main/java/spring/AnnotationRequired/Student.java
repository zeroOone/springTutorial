package spring.AnnotationRequired;

import org.springframework.beans.factory.annotation.Required;

/**
 * @Required 注解 ： 应用于bean属性的setter属性上，表明该属性必须放置在beans.xml中，否则报错；
 *                  例如： 你不使用该注释，你在beans.xml中可以不对它进行注入，否则必须注入。
 *
 *
 */
public class Student {
    private Integer age;
    private String name;

    public Integer getAge() {
        return age;
    }

    @Required
    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    @Required
    public void setName(String name) {
        this.name = name;
    }
}
