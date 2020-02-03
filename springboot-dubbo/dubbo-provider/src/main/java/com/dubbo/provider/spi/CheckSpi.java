package com.dubbo.provider.spi;

import com.alibaba.dubbo.common.extension.SPI;

@SPI("check")
public interface CheckSpi {
 public void  load();
}
