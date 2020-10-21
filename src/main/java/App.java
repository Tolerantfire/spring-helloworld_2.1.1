import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        HelloWorld bean2 = applicationContext.getBean(HelloWorld.class);
        Cat catBean = applicationContext.getBean(Cat.class);
        Cat catBean2 = applicationContext.getBean(Cat.class);
        System.out.println(bean.equals(bean2));
        System.out.println(catBean.equals(bean2));
    }
}