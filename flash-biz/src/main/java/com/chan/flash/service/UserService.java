package com.chan.flash.service;

import com.chan.flash.entity.SysUser;

/**
 * Copyright@chenyun
 * Author:chenyun
 * Date:2020/5/9
 * Description:
 */
public interface UserService {
    SysUser getUser(int id);
    int insertUser(SysUser sysUser);
    int updateUser(SysUser sysUser);
}
