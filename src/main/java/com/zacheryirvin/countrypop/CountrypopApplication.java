package com.zacheryirvin.countrypop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CountrypopApplication {
  public static CountList list = new CountList();
  	public static void main(String[] args) {
		SpringApplication.run(CountrypopApplication.class, args);
	}

}
