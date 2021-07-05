import com.fzy.entity.Hello;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext( "beans.xml");
        Hello hello = context.getBean("hello", Hello.class);
        System.out.println(hello);
    }
}
