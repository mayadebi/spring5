import com.fzy.entity.Ren;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Ren ren = context.getBean("ren", Ren.class);
        ren.getCat().jiao();
        ren.getDog().jiao();
    }
}
