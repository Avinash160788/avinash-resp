package com.sankalp;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GetBestStockController {

	Logger logger = LoggerFactory.getLogger(this.getClass());
	@Autowired
	Environment env;
	@GetMapping("/stock/{stock}")
	public String getBestStock(@PathVariable String stock)
	{
		System.out.println("stockname:"+stock+":port:"+env.getProperty("server.port"));
		logger.info("port"+env.getProperty("server.port"));
		//return this.failRandomly(stock+":"+env.getProperty("server.port"));
		return stock+":"+env.getProperty("server.port");
	}
	
	/*
	 * public String failRandomly(String stock) throws InterruptedException {
	 * Thread.sleep(100);
	 * 
	 * int random = ThreadLocalRandom.current().nextInt(1,3); if(random<2) return
	 * ResponseEntity.status(500).build().toString(); return stock; }
	 */
}
