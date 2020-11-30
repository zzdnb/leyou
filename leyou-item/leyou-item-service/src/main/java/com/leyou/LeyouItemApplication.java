package com.leyou;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author 张振东
 * @version V1.0
 * @Title:
 * @Package
 * @Description: (用一句话描述该文件做什么)
 * @date：
 */
@SpringBootApplication
@EnableDiscoveryClient
public class LeyouItemApplication {
	public static void main(String[] args) {
		SpringApplication.run(LeyouItemApplication.class,args);
	}
}
