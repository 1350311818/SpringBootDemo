package com.dubbo.provider.spi.Adaptive;

import com.alibaba.dubbo.common.URL;
import com.alibaba.dubbo.common.extension.Adaptive;
import com.alibaba.dubbo.common.extension.SPI;

@SPI
public interface Car {
    String getBrand();
    long getWeight();
    @Adaptive
    void make(URL url, String brand, long weight);
}
