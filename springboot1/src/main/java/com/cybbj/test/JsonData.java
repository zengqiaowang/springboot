/**   
 * 类名：JsonData
 *
 */
package com.cybbj.test;

import java.util.Date;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.support.config.FastJsonConfig;
import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;
import com.cybbj.pojo.User;

/** 
 * JsonData: 使用默认的jackson与自定义fastjson返回json测试
 * 
 * @version 1.0
 * @author 15989
 * @modified 2017-12-1 v1.0 15989 新建 
 */
@Controller
@SpringBootApplication
public class JsonData extends WebMvcConfigurerAdapter{
	
	@RequestMapping("getUser")
	@ResponseBody
	public User getUser() {
		User user = new User();
		user.setUserName("张三");
		user.setPassWord("1234");
		user.setAge(18);
		user.setBirthday(new Date());
		return user;
	}
	
	/** (非 Javadoc) 
	* @param converters 
	* @see org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter#configureMessageConverters(java.util.List) 
	*/
	@Override
	public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
		
		super.configureMessageConverters(converters);
		
		FastJsonHttpMessageConverter fastConverter = new FastJsonHttpMessageConverter();
		FastJsonConfig fastJsonConfig = new FastJsonConfig();
		fastJsonConfig.setSerializerFeatures(SerializerFeature.PrettyFormat);
		fastConverter.setFastJsonConfig(fastJsonConfig);
		converters.add(fastConverter);
	}
	
	public static void main(String[] args) {
		/*SpringApplication application = new SpringApplication(JsonData.class);
		application.run(args);*/
	}
}
