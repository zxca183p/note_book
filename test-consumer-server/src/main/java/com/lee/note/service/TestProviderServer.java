package com.lee.note.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;

import com.lee.note.foundation.facadeservice.GetInfoFacadeService;

@Component
@FeignClient("TEST-PROVIDER-SERVER")
public interface TestProviderServer extends GetInfoFacadeService{
    
}
