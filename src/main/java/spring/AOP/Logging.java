package spring.AOP;


/*
* AOP: 主要功能就是拦截一个应用程序，在执行某个方法的时候，让方法在执行前或者之后扩展功能（例如打印日志，安全验证之类的）
* */
public class Logging {

    //面向切面： 在选中的方法执行前切入，并定义执行动作
    public void beforeAdvice() {
        System.out.println("Going to setup student profile");
    }

    //面向切面： 在选中的方法执行之后切入，并定义执行动作
    public void afterAdvice() {
        System.out.println("Student profile has been setup");
    }

    //面向切面： 在任意方法返回值后切入，并定义执行动作
    public void afterReturningAdvice(Object retVal) {
        System.out.println("Returning : "  + retVal);
    }

    //面向切面： 在报错后切入，并定义执行动作
    public void AfterThrowingAdvice(IllegalArgumentException ex) {
        System.out.println("There has been an exception : " + ex.toString());
    }
}
