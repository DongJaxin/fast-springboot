package com.gitile.example.modules.system.service.impl;

import cn.hutool.core.convert.Convert;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.gitile.example.modules.system.entity.SystemUser;
import com.gitile.example.modules.system.mapper.SystemUserMapper;
import com.gitile.example.modules.system.service.TestService;
import org.springframework.stereotype.Service;

@Service
public class TestServiceImpl extends ServiceImpl<SystemUserMapper, SystemUser> implements TestService {
    @Override
    public String convert2String(String[] StrArray) {
        return Convert.toStr(StrArray);
    }

    @Override
    public String convert2String(int num) {
        return Convert.toStr(num);
    }
}
