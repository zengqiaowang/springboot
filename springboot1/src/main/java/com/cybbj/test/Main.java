/**   
 * 类名：Main
 *
 */
package com.cybbj.test;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.cybbj.javaconfig.SpringConfig;
import com.cybbj.pojo.User;
import com.cybbj.service.UserService;

/** 
 * Main: TODO请填写类描述
 * 
 * @version 1.0
 * @author 15989
 * @modified 2017-11-23 v1.0 15989 新建 
 */
public class Main {
/*
	public static void main(String[] args) {
		//通过java配置来实例化spring容器
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
		//在spring容器中获取bean对象
		UserService userService = context.getBean(UserService.class);
		//调用对象中的方法
		List<User> list = userService.queryUserList();
		for (User user:list) {
			System.out.println(user.getUserName()+","+user.getPassWord()+","+user.getAge());
		}
		//销毁该容器
		context.destroy();
	}*/
}
