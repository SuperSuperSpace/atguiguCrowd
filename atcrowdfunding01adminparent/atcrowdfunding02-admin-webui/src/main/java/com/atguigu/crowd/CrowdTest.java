package com.atguigu.crowd;

import com.atguigu.crowd.entity.Admin;
import com.atguigu.crowd.entity.Role;
import com.atguigu.crowd.mapper.AdminMapper;
import com.atguigu.crowd.mapper.RoleMapper;
import com.atguigu.crowd.service.api.AdminService;
import com.atguigu.crowd.service.impl.AdminServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.web.filter.DelegatingFilterProxy;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring-persist-mybatis.xml","classpath:spring-persist-tx.xml"})
public class CrowdTest {

    @Autowired
    private DataSource dataSource;

    @Autowired
    private AdminService adminService;

    @Autowired
    private AdminMapper adminMapper;

    @Autowired
    private RoleMapper roleMapper;

    @Autowired
    private BCryptPasswordEncoder passwordEncoder;

    @Test
    public void testFindAll() {
        List<Admin> lists = adminService.findAll();
        for(Admin admin : lists) {
            System.out.println(admin);
        }
    }

    @Test
    public void testSaltPasswd() {
        String encoded = passwordEncoder.encode("123123");
        System.out.println(encoded);
    }

    @Test
    public void testSave() {
        Admin admin = new Admin(null, "kkkkk", "123123", "aaa", "aa@aaa.com", null);
        adminService.saveAdmin(admin);

    }

    @Test
    public void testInsert() {
        for(int i = 1; i <= 100; i++) {
            adminMapper.insert(new Admin(null,"loginAcct"+i,"userPswd"+i,"userName"+i,"email"+i+"@qq.com",null));
        }
    }

    @Test
    public void testRoleSave() {
        for(int i = 1; i <= 100; i++) {
            roleMapper.insert(new Role(null,"name"+i));
        }
    }

    @Test
    public void testConnection() throws SQLException {
        Connection connection = dataSource.getConnection();
        System.out.println(connection);
    }
}
