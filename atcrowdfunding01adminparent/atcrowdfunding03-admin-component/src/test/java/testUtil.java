import com.atguigu.crowd.entity.Admin;
import com.atguigu.crowd.mapper.AdminMapper;
import com.atguigu.crowd.service.api.AdminService;
import com.atguigu.crowd.util.CrowdUtil;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;


public class testUtil {

    @Autowired
    private AdminService adminService;

    @Autowired
    private AdminMapper adminMapper;

    @Test
    public void testMd5() {
        System.out.println(CrowdUtil.md5("123123"));
    }

}
