package com.finotek.batch;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BatchProjectApplication {

	public static void main(String[] args) {
		System.getProperties().put( "server.port", "8088");
		System.getProperties().put( "spring.data.mongodb.uri", "mongodb://chatbot:chatbot1234!@192.168.20.254:27017/finobot_v3?maxIdleTimeMS=5000" );
		
		SpringApplication.run(BatchProjectApplication.class, args);
	}
}
