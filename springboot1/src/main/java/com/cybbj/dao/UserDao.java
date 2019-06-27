/**   
 * 类名：UserDao
 *
 */
package com.cybbj.dao;

import java.util.ArrayList;
import java.util.List;

import com.cybbj.pojo.User;

/** 
 * UserDao: TODO请填写类描述
 * 
 * @version 1.0
 * @author 15989
 * @modified 2017-11-23 v1.0 15989 新建 
 */
public class UserDao {
	public List<User> queryUserList() {
		List<User> result = new ArrayList<User>();
		User user = null;
		for (int i = 0; i < 10; i++) {
			user = new User();
			user.setUserName("username_"+i);
			user.setPassWord("password_"+i);
			user.setAge(i+1);
			result.add(user);
		}
		return result;
	}
}
