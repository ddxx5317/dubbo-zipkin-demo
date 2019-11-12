package com.ddxx.dubbo.provider;

public class DubboZipkinProvider {

	public static void main(String[] args) {
        System.out.println("provider started");
        com.alibaba.dubbo.container.Main.main(args);
	}

}