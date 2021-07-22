
import com.fzy.dao.SysUserMapperImpl;
import com.fzy.entity.SysUser;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class MyTest {
    @Test
    public void test() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationCentext.xml");
        SysUserMapperImpl sysUserMapper = context.getBean("sysUserMapperImpl", SysUserMapperImpl.class);
        List<SysUser> userListAll = sysUserMapper.getUserListAll();
        for (SysUser sysUser : userListAll) {
            System.out.println(sysUser.toString());
        }
    }

}
