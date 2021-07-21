import com.fzy.service.SysUserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationCentext.xml");
//        aop代理的是接口
        SysUserService serviceImpl = context.getBean("sysUserServiceImpl", SysUserService.class);
        serviceImpl.add();
    }
}
