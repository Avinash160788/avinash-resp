package com.sankalp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;

import brave.sampler.Sampler;

/**
 * @author bhaskar
 *
 */
@EnableEurekaClient
@SpringBootApplication
public class GetBestStockServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(GetBestStockServiceApplication.class, args);
	}

	@Bean
	public Sampler defaultSampler() {
		return Sampler.ALWAYS_SAMPLE;
	}
}
