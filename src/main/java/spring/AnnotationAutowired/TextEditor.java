package spring.AnnotationAutowired;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * @Autowired 注释 ： 用在不同地方效果不同；
 *
 *                      setter 上 ： 使用byType方式链接（使用这种方式，要确保bean的唯一性）
 *
 *                      属性上：    可以消除setter方法，即不需要定义setter
 *
 *                      构造函数上 ： 使用构造函数注入的话，可以省略construct-arg属性
 *
 *                      autowired 类似required，意味着依赖必须，但是可以使用 Autowired(required=false)来关闭这样的默认行为
 */
class SpellChecker {

    public SpellChecker() {
        System.out.println("Inside checkSpelling.");
    }

    public void checkSpelling() {
        System.out.println("Inside checkSpelling.");
    }
}

public class TextEditor {
    /**
     * 对属性使用Autowired注释，就可以省去setter方法了。现在可以把setter方法注释掉了
     */
    /*
    @Autowired
    */
    private SpellChecker spellChecker;

    /**
     * 在构造函数上使用autowired注释，那么在使用构造函数注入的时候，就无需使用construct-arg属性了
     * @param spellChecker
     */
    public TextEditor(SpellChecker spellChecker) {
        this.spellChecker = spellChecker;
    }
    public TextEditor(){

    }

    public SpellChecker getSpellChecker() {
        return spellChecker;
    }

    //使用在setter上

    @Autowired
    public void setSpellChecker(SpellChecker spellChecker) {
        this.spellChecker = spellChecker;
    }

    public void spellCheck() {
        spellChecker.checkSpelling();
    }
}
