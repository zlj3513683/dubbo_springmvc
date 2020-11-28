package com.provider.service;

import com.api.service.DemoService;

/**
 * 功能：服务提供者接口实现
 *
 * @author zoulinjun
 * @date 2020/11/28
 */
public class DemoServiceImpl implements DemoService {

    @Override
    public String sayHello(String name) {
        return "provider hello" + name;
    }
}
