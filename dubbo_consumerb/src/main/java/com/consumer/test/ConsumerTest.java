package com.consumer.test;

import com.api.service.DemoService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * 功能：服务消费方测试类
 *
 * @author zoulinjun
 * @date 2020/11/28
 */
public class ConsumerTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] { "classpath:springmvc.xml" });

        context.start();

        for (int i = 0; i < 10; i++) {
            DemoService demoService = (DemoService) context.getBean("demoService");

            System.out.println(demoService.sayHello("哈哈哈"));
        }

        try {
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
