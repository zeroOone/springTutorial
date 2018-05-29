package spring.JavaConfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {

    public static void main(String[] args) {
        //将java配置类放入容器中
        ApplicationContext ctx = new AnnotationConfigApplicationContext(HelloWorldConfig.class);
        HelloWorld helloWorld = (HelloWorld) ctx.getBean(HelloWorld.class);
        helloWorld.setMessage("test ");
        helloWorld.getMessage();

        System.out.println("基于构造函数的依赖注入： ");
        ApplicationContext ctx1 = new AnnotationConfigApplicationContext(TextEditorConfig.class);
        TextEditor textEditor = (TextEditor) ctx1.getBean(TextEditor.class);
        textEditor.spellChecker();
    }
}
