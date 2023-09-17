package com.lee.note.controller;

import org.springframework.web.bind.annotation.RestController;

import com.lee.note.foundation.biz.bean.UserInfo;
import com.lee.note.foundation.common.bean.Header;
import com.lee.note.foundation.common.bean.RestWrapper;
import com.lee.note.foundation.facadeservice.GetInfoFacadeService;

@RestController
public class GetInfoController implements GetInfoFacadeService {
    @Override
    public RestWrapper<UserInfo> getUserInfo(RestWrapper<UserInfo> requestWrapper) {
        if ("benson".equals(requestWrapper.getRestBody().getUserName())) {
            UserInfo userInfo = new UserInfo("benson", 25);
            Header header = new Header();
            RestWrapper<UserInfo> rw = new RestWrapper<>(header, userInfo);
            return rw;
        }
        return null;
    }

}
