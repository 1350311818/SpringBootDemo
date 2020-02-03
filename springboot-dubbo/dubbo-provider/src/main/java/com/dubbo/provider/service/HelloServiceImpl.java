package com.dubbo.provider.service;

import com.alibaba.dubbo.common.extension.ExtensionLoader;
import com.alibaba.dubbo.config.annotation.Service;
import com.dubbo.provider.spi.CheckSpi;
import com.dubbo.service.HelloService;
import org.springframework.stereotype.Component;

//dubbo注解，暴露服务
@Service
@Component
public class HelloServiceImpl implements HelloService {

    @Override
    public String sayHello(String name) {
        //使用dubbo spi
        ExtensionLoader<CheckSpi> extensionLoader = ExtensionLoader.getExtensionLoader(CheckSpi.class);
        CheckSpi spi=extensionLoader.getExtension("check");
        spi.load();
        return "Hello" + name;
    }
}
