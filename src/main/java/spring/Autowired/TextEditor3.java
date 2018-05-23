package spring.Autowired;

/**
 * 总结 ： 自动装配的不同模式 (在这里，TextEditor3为依赖类，SpellChecker3为被依赖类)
 *
 * byName ： 只要被注入的bean的属性等于依赖类中声明的属性就可以（即检查被注入的bean的class与这里的SpellChecker3是否一致
 *
 * byTag  ： 配置文件中只允许有一个被依赖类的bean（即在配置文件中，只允许一个bean的class等于SpellChecker3）
 *
 * constructor ： 构造函数的参数类型相等即可（就是说，配置文件中，被注入的bean 的class要与这里的SpellChecker3相同）
 *
 * constructor与byName不同之处在于，不要byName需要set函数和默认构造函数
 * constructor需要自定义一个参数的构造函数
 * 这三者都是通过寻找bean中的class属性，再通过不同策略来进行注入，跟bean的id属性没有关系
 */
public class TextEditor3 {
    private SpellChecker3 spellChecker10;
    private String name;
    public TextEditor3(SpellChecker3 spellChecker5) {
        this.spellChecker10 = spellChecker5;
    }
    public TextEditor3(){

    }
    //自动装配byName的时候，被注入的bean的名必须与这里注入的类同名，比如这里的spellChecker3；
    public void setSpellChecker3( SpellChecker3 spellChecker3 ){
        this.spellChecker10 = spellChecker3;
    }
    public SpellChecker3 getSpellChecker3() {
        return spellChecker10;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void spellCheck() {
        spellChecker10.checkSpelling();
    }
}

class SpellChecker3 {
    public SpellChecker3() {
        System.out.println("Inside SpellChecker constructor." );
    }
    public void checkSpelling() {
        System.out.println("Inside checkSpelling." );
    }
}