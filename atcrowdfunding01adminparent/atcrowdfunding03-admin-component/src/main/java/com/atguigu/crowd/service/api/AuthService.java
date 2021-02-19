package com.atguigu.crowd.service.api;

import com.atguigu.crowd.entity.Auth;

import java.util.List;

public interface AuthService {

    List<Auth> getAllAuth();

    List<Integer> getAssignedAuthIdByRoleId(Integer roleId);

    void deleteOldRelationship(Integer roleId);

    void insertNewRelationship(Integer roleId, List<Integer> authIdList);

    List<String> getAssignedAuthNameByAdminId(Integer adminId);
}
