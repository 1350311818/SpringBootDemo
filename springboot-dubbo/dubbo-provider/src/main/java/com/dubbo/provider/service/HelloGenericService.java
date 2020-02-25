package com.dubbo.provider.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.alibaba.dubbo.rpc.service.GenericException;
import com.alibaba.dubbo.rpc.service.GenericService;
import org.springframework.stereotype.Component;

//dubbo注解，暴露服务
@Service
@Component
public class HelloGenericService implements GenericService {
    @Override
    public Object $invoke(String method, String[] parameterTypes, Object[] args) throws GenericException {
        return null;
    }
}
