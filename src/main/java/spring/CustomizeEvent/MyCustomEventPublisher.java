package spring.CustomizeEvent;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;

public class MyCustomEventPublisher implements ApplicationEventPublisherAware {
    private ApplicationEventPublisher publisher;

    public void setApplicationEventPublisher(ApplicationEventPublisher publisher) {
        this.publisher = publisher;
    }

    public void publish() {
        MyCustomEvent ce = new MyCustomEvent(this);
        publisher.publishEvent(ce);
    }
}
