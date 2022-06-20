package com.example.demo;

import java.beans.beancontext.BeanContext;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.jms.annotation.EnableJms;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.web.client.RestTemplate;

@EnableEurekaClient
@SpringBootApplication
@EnableFeignClients
@EnableJms
public class Demo1Application {
	
	/*
	 * @Autowired public ApplicationContext appContext;
	 */
	
	@LoadBalanced
	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}
	/*
	 * @Bean public JmsTemplate jmsTemplate(ConfigurableApplicationContext context)
	 * { return appContext.getBean(JmsTemplate.class); }
	 */

	public static void main(String[] args) {
		SpringApplication.run(Demo1Application.class, args);
		
	}

}
