package spring.JavaConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 该案例展示了如何在java配置中解决依赖注入的问题，这里展示的是基于构造函数的依赖注入；
 */

@Configuration
public class TextEditorConfig {
    @Bean
    public TextEditor textEditor() {
        return new TextEditor(spellChecker());
    }
    @Bean
    public SpellChecker spellChecker() {
        return  new SpellChecker();
    }

}


