package com.gitile.example.modules.system.service;

import com.baomidou.mybatisplus.service.IService;
import com.gitile.example.modules.system.entity.SystemUser;

public interface TestService extends IService<SystemUser> {

    /***
     * 数组转字符串
     * @param StrArray
     * @return
     */
    String convert2String(String[] StrArray);

    /***
     * 数字转字符串
     * @param num
     * @return
     */
    String convert2String(int num);
}
