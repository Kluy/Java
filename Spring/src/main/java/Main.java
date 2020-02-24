import model.Cat;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import util.MainConfig;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(MainConfig.class);
        Cat cat = context.getBean("cat", Cat.class);
        System.out.println(cat.getFood());
    }
}
