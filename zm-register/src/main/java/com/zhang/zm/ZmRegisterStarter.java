package com.zhang.zm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * <b>项目注册启动类</b>
 * @author 张柯柯
 * @date 2022/7/2
 */
@SpringBootApplication
@EnableEurekaServer
public class ZmRegisterStarter {
		public static void main(String[] args) {
			SpringApplication.run(ZmRegisterStarter.class,args);
		}
	}

