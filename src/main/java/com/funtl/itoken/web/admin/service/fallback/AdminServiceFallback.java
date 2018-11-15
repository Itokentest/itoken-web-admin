package com.funtl.itoken.web.admin.service.fallback;

import com.funtl.itoken.common.constants.HttpStatusConstants;
import com.funtl.itoken.common.dto.BaseResult;
import com.funtl.itoken.common.utils.MapperUtils;
import com.funtl.itoken.web.admin.service.AdminService;
import com.google.common.collect.Lists;
import org.springframework.stereotype.Component;

/**
 * <p>Title: AdminServiceFallback</p>
 * <p>Description: </p>
 *
 * @author wgw
 * @version 1.0.0
 * @date 2018/11/13 17:08
 */
@Component
public class AdminServiceFallback implements AdminService {
    @Override
    public String login(String loginCode, String password) {

        BaseResult baseResult = BaseResult.notOk(Lists.newArrayList(
                new BaseResult.Error(
                    String.valueOf(HttpStatusConstants.BAD_GATEWAY.getStatus()),
                    String.valueOf(HttpStatusConstants.BAD_GATEWAY.getContent()))));

        try {
            return MapperUtils.obj2json(baseResult);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }
}
