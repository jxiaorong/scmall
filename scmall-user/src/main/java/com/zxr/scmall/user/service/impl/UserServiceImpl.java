package com.zxr.scmall.user.service.impl;

import com.zxr.scmall.user.bean.UmsMember;
import com.zxr.scmall.user.mapper.UserMapper;
import com.zxr.scmall.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<UmsMember> getAllUser() {
        List<UmsMember> umsMemberList = userMapper.selectAll();
        return umsMemberList;
    }
}
