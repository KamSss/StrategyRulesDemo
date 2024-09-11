package org.demo.strategyrulesdemo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("org.demo.strategyrulesdemo.mapper")
public class StrategyRulesDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(StrategyRulesDemoApplication.class, args);
	}

}
