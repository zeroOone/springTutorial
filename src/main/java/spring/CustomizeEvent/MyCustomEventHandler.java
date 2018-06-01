package spring.CustomizeEvent;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;

public class MyCustomEventHandler implements ApplicationListener<MyCustomEvent> {
    @Override
    public void onApplicationEvent(MyCustomEvent myCustomEvent) {
        System.out.println(myCustomEvent.toString());
    }
}
