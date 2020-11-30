package com.leyou;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @author 张振东
 * @version V1.0
 * @Title:
 * @Package:
 * @Description: (用一句话描述该文件做什么)
 * @date：
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableZuulProxy
public class LeyouGateWayApplication {
	public static void main(String[] args) {
		SpringApplication.run(LeyouGateWayApplication.class);

	}
}