package com.ddxx.dubbo.consumer;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.ddxx.dubbo.api.DemoService;

public class DubboZipkinConsumer {

    @SuppressWarnings("resource")
	public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"META-INF/spring/dubbo-zipkin-consumer.xml"});
        context.start();

        DemoService demoService = (DemoService) context.getBean("demoService"); // 获取远程服务代理
        String hello = demoService.sayHello("world"); // 执行远程方法

        System.out.println(hello); // 显示调用结果
        
        try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
        System.exit(0);
    }
}
