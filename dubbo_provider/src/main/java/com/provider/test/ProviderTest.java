package com.provider.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * 功能：
 *
 * @author zoulinjun
 * @date 2020/11/28
 */
public class ProviderTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:springmvc.xml");
        context.start();

        System.out.println("Dubbo provider start...");

        try {
            System.in.read();   // 按任意键退出
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
