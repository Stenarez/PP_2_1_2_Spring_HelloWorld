import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        HelloWorld bean1 =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());
        System.out.println(bean == bean1);

//        ApplicationContext context =
//                new AnnotationConfigApplicationContext(AppConfig.class);
        Cat beani = (Cat) applicationContext.getBean("cat");
        Cat beany = (Cat) applicationContext.getBean("cat");
        System.out.println(beani.getSay());
        System.out.println(beani == beany);


    }
}