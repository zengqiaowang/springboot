/**   
 * 类名：UserService
 *
 */
package com.cybbj.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cybbj.dao.UserDao;
import com.cybbj.pojo.User;

/** 
 * UserService: TODO请填写类描述
 * 
 * @version 1.0
 * @author 15989
 * @modified 2017-11-23 v1.0 15989 新建 
 */
@Service
public class UserService {

	@Autowired
	private UserDao userDao;
	public List<User> queryUserList() {
		//調用userDao中的方法进行查询
		return this.userDao.queryUserList();
	}
}
