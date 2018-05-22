package spring.IoC;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanTemplate {
    private String message ;
    private String message1 ;

    private String message6 ;

    private String message7 ;

    public void getMessage() {
        System.out.println("Message: " + message);
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void getMessage1() {
        System.out.println("Message1: " + message1);
    }

    public void setMessage1(String message1) {
        this.message1 = message1;
    }

    public void getMessage6() {
        System.out.println("Message6: " + message6);
    }

    public void setMessage6(String message6) {
        this.message6 = message6;
    }

    public void getMessage7() {
        System.out.println("Message7: " + message7);
    }

    public void setMessage7(String message7) {
        this.message7 = message7;
    }

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        BeanTemplate obj =(BeanTemplate) context.getBean("templateSon");
        obj.getMessage();
        obj.getMessage1();
        obj.getMessage6();
        obj.getMessage7();
    }
}
