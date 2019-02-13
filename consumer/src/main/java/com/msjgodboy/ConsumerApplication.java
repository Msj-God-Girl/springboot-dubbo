package com.msjgodboy;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDubboConfiguration
public class ConsumerApplication {

	public static void main(String[] args) {

		System.setProperty("spring.devtools.restart.enabled", "false");

		SpringApplication.run(ConsumerApplication.class, args);
	}

}

