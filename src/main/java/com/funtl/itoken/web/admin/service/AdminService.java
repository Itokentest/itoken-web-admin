package com.funtl.itoken.web.admin.service;

import com.funtl.itoken.web.admin.service.fallback.AdminServiceFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * <p>Title: AdminService</p>
 * <p>Description: </p>
 *
 * @author wgw
 * @version 1.0.0
 * @date 2018/11/13 17:05
 */
@FeignClient(value = "itoken-service-admin",fallback = AdminServiceFallback.class)
public interface AdminService {

    @RequestMapping(value = "login",method = RequestMethod.GET)
    public String login(@RequestParam(value = "loginCode") String loginCode,@RequestParam(value = "password") String password);

}

