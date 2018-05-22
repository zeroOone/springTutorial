package spring.firstSpring;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class HelloSpring implements InitializingBean, DisposableBean {
    private String message;

    public void setMessage(String message) {
        this.message = message;
    }

    public void getMessage() {
        System.out.println("Your message : " + message);
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
