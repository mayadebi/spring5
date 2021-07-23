

import com.fzy.entity.SysUser;
import com.fzy.service.SysUserServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class MyTest {
    @Test
    public void test() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationCentext.xml");
        SysUserServiceImpl sysUserServiceImpl = context.getBean("sysUserServiceImpl", SysUserServiceImpl.class);
        List<SysUser> userListAll = sysUserServiceImpl.getUserListAll();
        for (SysUser sysUser : userListAll) {
            System.out.println(sysUser.toString());
        }
    }

}
