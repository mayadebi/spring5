import com.fzy.controller.SysUserContorller;
import com.fzy.entity.SysUser;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationCentext.xml");
        SysUserContorller sysUserController = context.getBean("sysUserContorller", SysUserContorller.class);
        System.out.println(sysUserController.getSysUserService().getSysUserDao().getSysUser().getName());
    }
}
