import com.fzy.service.SysUserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext( "beans.xml");
        SysUserServiceImpl sysUserServiceImpl = context.getBean("sysUserServiceImpl", SysUserServiceImpl.class);
        sysUserServiceImpl.getUser();
    }
}

