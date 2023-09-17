package com.lee.note.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.lee.note.foundation.biz.bean.UserInfo;
import com.lee.note.foundation.common.bean.RestWrapper;
import com.lee.note.foundation.facadeservice.GetInfoFacadeService;
import com.lee.note.service.TestProviderServer;

@RestController
public class GetInfoController implements GetInfoFacadeService {

    @Autowired
    private TestProviderServer testProviderServer;

    @Override
    public RestWrapper<UserInfo> getUserInfo(RestWrapper<UserInfo> userName) {
        RestWrapper<UserInfo> res = testProviderServer.getUserInfo(userName);
        return res;
    }

}
