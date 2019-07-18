package com.intehel.core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Import;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@ComponentScan(value = {"com.intehel.core"})
@MapperScan(basePackages = "com.intehel.core.system.mapper")
public class IntehelCoreApplication {
	public static void main(String[] args) {
		SpringApplication.run(IntehelCoreApplication.class, args);
	}

}
