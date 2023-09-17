package com.lee.note.foundation.facadeservice;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.lee.note.foundation.biz.bean.UserInfo;
import com.lee.note.foundation.common.bean.RestWrapper;


public interface GetInfoFacadeService {

    @RequestMapping(value = "getUserInfo", method = { RequestMethod.POST })
    public RestWrapper<UserInfo> getUserInfo(@RequestBody RestWrapper<UserInfo> userName);
}
