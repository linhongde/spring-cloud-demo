package com.hong.service;

import com.hong.entity.AuthUser;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.List;

public interface UserService extends UserDetailsService {
    /**
     * 根据用户名称获取用户信息
     * @param userName
     * @return
     */
    AuthUser getUserByName(String userName);

    /**
     * 根据用户id获取用户信息
     * @param userId
     * @return
     */
    AuthUser getUserById(Long userId);

    /**
     * 保存用户信息
     * @param authUser
     * @return
     */
    Boolean saveUser(AuthUser authUser);

    /**
     * 根据用户ID删除用户信息
     * @param userId
     * @return
     */
    Boolean deleteUser(Long userId);

    /**
     * 修改用户信息
     * @param authUser
     * @return
     */
    Boolean updateUser(AuthUser authUser);

    /**
     * 根据筛选条件获取用户信息列表
     * @param authUser
     * @return
     */
    List<AuthUser>listAuthUser(AuthUser authUser);
}
