package com.hrq.platform.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName SystemUserManage
 * @Description
 * @Author huangrq
 * @Date 2019/6/19 17:21
 */
@RestController
@RequestMapping("/sysUserManage")
public class SystemUserManage {

    @Value("${test}")
    String test;


    @RequestMapping("/getListSysUser")
    public String getListSysUser() {
        return test;
    }
}
