package com.providerb.service;

import com.api.service.DemoService;

/**
 * 功能：
 *
 * @author zoulinjun
 * @date 2020/11/28
 */
public class DemoServiceImpl2 implements DemoService {

    @Override
    public String sayHello(String name) {
        return "provider2 say " + name;
    }
}
