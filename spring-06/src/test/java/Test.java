import com.fzy.config.EntityConfig;
import com.fzy.entity.SysUser;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(EntityConfig.class);
//        通过方法名获取bean   这里使用的是配置entityconfig里配置的
//        SysUser getUser = context.getBean("getUser", SysUser.class);
//        使用注解
        SysUser getUser = context.getBean("sysUser", SysUser.class);
        System.out.println(getUser);
    }
}
