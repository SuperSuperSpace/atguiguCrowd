package com.atguigu.crowd.service.api;

import com.atguigu.crowd.entity.Admin;
import com.github.pagehelper.PageInfo;

import java.util.List;

public interface AdminService {
    List<Admin> findAll();

    void saveAdmin(Admin admin);

    Admin getAdminByLoginAcct(String loginAcct, String userPswd);

    PageInfo<Admin> getAdminPage(String keyword, Integer pageNum, Integer pageSize);

    Admin getAdminById(Integer adminId);

    void update(Admin admin);

    void remove(Integer adminId);

    void saveAdminRoleRelationship(Integer adminId, List<Integer> roleldList);

    Admin getAdminByLoginAcct(String loginAcct);
}
