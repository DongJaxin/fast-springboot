package com.gitile.example.modules.system.web;


import cn.hutool.core.convert.Convert;
import com.gitile.example.modules.system.service.TestService;
import com.gitile.fast.core.entity.FastR;
import com.gitile.fast.core.web.controller.FastController;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * <p>
 * 系统用户 前端控制器
 * </p>
 *
 * @author local
 * @since 2018-07-04
 */
@RestController
@Api(tags= "新建接口")
@RequestMapping("/system/user")
public class SystemUserController extends FastController {

    @Autowired
    TestService testService;

    @PostMapping("/test")
    @ApiOperation(value="测试方法", notes="测试hutool公公类库", response= FastR.class)
    @ApiImplicitParams({
            @ApiImplicitParam(name = "token", value = "认证令牌", required = true),
    })
    @ApiResponses({
            @ApiResponse(code = 200, message = "请求成功")
    })
    public FastR testHutool(@RequestHeader("token") String token) {
        //其他类型 转换为 字符串
        int num = 3;
        String num2Str = Convert.toStr(num);
        System.out.println("数字转字符串："+num2Str);

        long[] array = {1,2,3,4,5};
        String array2Str = Convert.toStr(array);
        System.out.println("数字转字符串："+array2Str);

        //其他类型数组 转换为 指定类型数组
        String[] StrArray = { "1", "2", "3", "4" };
        Integer[] intArray = Convert.toIntArray(StrArray);
        System.out.println("字符串类型数组 转换为 integer类型数组："+intArray);
        String[] strArray = Convert.toStrArray(StrArray);
        System.out.println("字符串类型数组 转换为 字符串类型数组："+strArray);

        //字符串转日期
        String dateStr = "2017-05-06 10:00:55";
        Date date = Convert.toDate(dateStr);
        System.out.println("字符串转日期："+date);
        return FastR.ok("测试返回数据");
    }
}

