import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);

        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());
        HelloWorld beanSecondHW =
                (HelloWorld) applicationContext.getBean("helloworld");
        Cat beanFirstCat = (Cat) applicationContext.getBean("cat");
        Cat beanSecondCat = (Cat) applicationContext.getBean("cat");
        System.out.println(bean == beanSecondHW);
        System.out.println(beanFirstCat == beanSecondCat);
    }
}