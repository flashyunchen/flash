package com.chan.flash.service.impl;

import com.chan.flash.entity.SysUser;
import com.chan.flash.mapper.SysUserMapper;
import com.chan.flash.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Copyright@chenyun
 * Author:chenyun
 * Date:2020/5/9
 * Description:
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private SysUserMapper sysUserMapper;
    @Override
    public int insertUser(SysUser sysUser) {
        return sysUserMapper.insert(sysUser);
    }

    @Override
    public SysUser getUser(int id) {
        return sysUserMapper.selectById(id);
    }

    @Override
    public int updateUser(SysUser sysUser) {
        return sysUserMapper.updateById(sysUser);
    }
}
