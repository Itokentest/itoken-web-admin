package com.funtl.itoken.web.admin.controller;

import com.funtl.itoken.web.admin.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * <p>Title: AdminController</p>
 * <p>Description: </p>
 *
 * @author wgw
 * @version 1.0.0
 * @date 2018/11/13 16:52
 */
@Controller
public class AdminController {


    @Autowired
    private AdminService adminService;
    /**
     * 跳转登录页
     * @return
     */

    @RequestMapping(value = {"","login"},method = RequestMethod.GET)
    public String login() {
        String json = adminService.login("", "");
        System.out.println(json);
        return "index";
    }
}
