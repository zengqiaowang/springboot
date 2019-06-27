/**   
 * 类名：HelloApplication
 *
 */
package com.cybbj.test;

import org.springframework.boot.Banner;
import org.springframework.boot.Banner.Mode;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.redis.RedisAutoConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/** 
 * HelloApplication: TODO请填写类描述
 * 
 * @version 1.0
 * @author 15989
 * @modified 2017-11-28 v1.0 15989 新建 
 */
@Controller
//exclude关闭某一项自动配置
@SpringBootApplication(exclude={RedisAutoConfiguration.class})
//使用springboot最好将以下的@Configuration改为@SpringBootConfiguration
@Configuration
public class HelloApplication {

	@RequestMapping("hello")
	@ResponseBody
	public String hello() {
		return "hello world";
	}
	
/*	public static void main(String[] args) {
		//SpringApplication.run(HelloApplication.class, args);
		SpringApplication application = new SpringApplication(HelloApplication.class);
		application.setBannerMode(Banner.Mode.OFF);
		application.run(args);
	}*/
}
