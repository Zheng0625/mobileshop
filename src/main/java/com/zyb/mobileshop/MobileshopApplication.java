package com.zyb.mobileshop;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


@SpringBootApplication
@MapperScan(value = {"com.zyb.mobileshop.dao"})//手动配置dao路径
@EnableSwagger2
/** 不加此注解报错 A component required a bean of type 'com.zyb.mobileshop.dao.xxx' that could not be found.*/


public class MobileshopApplication {
	public static void main(String[] args) {
		SpringApplication.run(MobileshopApplication.class, args);
	}

}
