/**   
 * 类名：User
 *
 */
package com.cybbj.pojo;

import java.util.Date;

import com.alibaba.fastjson.annotation.JSONField;

/** 
 * User: 用户对象
 * 
 * @version 1.0
 * @author 15989
 * @modified 2017-11-23 v1.0 15989 新建 
 */
public class User {
	private String userName;
	private String passWord;
	private Integer age;
	@JSONField(format="YYYY-MM-dd")
	private Date birthday;
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassWord() {
		return passWord;
	}
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	
	
}
