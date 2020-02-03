package com.dubbo.provider.spi;

public class UseSpi implements CheckSpi{
    @Override
    public void load() {
        System.out.println("-------------------");
        System.out.println("------use Spi------");
        System.out.println("-------------------");

    }
}
