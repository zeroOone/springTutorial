package spring.firstSpring;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class HelloSpring implements InitializingBean, DisposableBean {
    private String message;
    private String message2;

    public void setMessage(String message) {
        this.message = message;
    }

    public void getMessage() {
        System.out.println("Your message : " + message);
    }

    public void setMessage2(String message2) {
        this.message2 = message2;
    }

    public void getMessage2() {
        System.out.println("Message2 : " + message2);
    }

    //初始化
    @Override
    public void afterPropertiesSet() {
        System.out.println("Starting Initialize Bean.");
    }

    //销毁
    @Override
    public void destroy() {
        System.out.println("Starting Destroy Bean. ");
    }

    public void initializeBean() {
        System.out.println("Starting Initialize (Created)");
    }

    public void destroyBean() {
        System.out.println("Starting destroy bean(created)");
    }
}
