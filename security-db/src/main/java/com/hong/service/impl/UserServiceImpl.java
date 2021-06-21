package com.hong.service.impl;

import com.hong.entity.AuthUser;
import com.hong.entity.AuthUserDetails;
import com.hong.mapper.AuthUserMapper;
import com.hong.service.UserService;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Resource
    AuthUserMapper authUserMapper;


    @Override
    public AuthUser getUserByName(String userName) {
        return authUserMapper.selectByUserName(userName);
    }

    @Override
    public AuthUser getUserById(Long userId) {
        return authUserMapper.selectByPrimaryKey(userId);
    }

    @Override
    public Boolean saveUser(AuthUser authUser) {
        return authUserMapper.insert(authUser)==1?true:false;
    }

    @Override
    public Boolean deleteUser(Long userId) {
        return authUserMapper.deleteByPrimaryKey(userId)==1?true:false;
    }

    @Override
    public Boolean updateUser(AuthUser authUser) {
        return authUserMapper.updateByPrimaryKey(authUser)==1?true:false;
    }

    @Override
    public List<AuthUser> listAuthUser(AuthUser authUser) {
        return authUserMapper.listAuthUser(authUser);
    }

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        AuthUser authUser = authUserMapper.selectByUserName(s);
        return new AuthUserDetails(authUser);
    }
}
