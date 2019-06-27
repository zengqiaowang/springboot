/**   
 * 类名：HelloJsp
 *
 */
package com.cybbj.action;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/** 
 * HelloJsp: TODO请填写类描述
 * 
 * @version 1.0
 * @author 15989
 * @modified 2017-12-11 v1.0 15989 新建 
 */
@Controller
public class HelloJsp {
	private String name="";
	@RequestMapping("/helloJsp")
	public String HelloJsp(Map<String, Object> oMap) {
		oMap.put("name", "qiaowang");
		return "helloJsp";
	}
}
