/**   
 * 类名：SpringConfig
 *
 */
package com.cybbj.javaconfig;

import java.beans.PropertyVetoException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.cybbj.dao.UserDao;
import com.mchange.v2.c3p0.ComboPooledDataSource;

/** 
 * SpringConfig: TODO请填写类描述
 * 
 * @version 1.0
 * @author 15989
 * @modified 2017-11-23 v1.0 15989 新建 
 */
@Configuration
@ComponentScan(basePackages="com.cybbj") //配置扫描包
@PropertySource(value={"classpath:jdbc.properties"},ignoreResourceNotFound=true)
public class SpringConfig {
	
	@Value("${jdbcUrl}")
	private String jdbcUrl="";
	@Value("${driverClass}")
	private String jdbcDriverClassName;
	@Value("${user}")
	private String jdbcUserName;
	@Value("${password}")
	private String jdbcPassword;
	
	@Bean(destroyMethod="close")
	public DataSource dataSource() {
		ComboPooledDataSource dataSource = new ComboPooledDataSource();
		try {
			dataSource.setDriverClass(jdbcDriverClassName);
			dataSource.setJdbcUrl(jdbcUrl);
			dataSource.setUser(jdbcUserName);
			dataSource.setPassword(jdbcPassword);
			dataSource.setMinPoolSize(3);
			dataSource.setMaxPoolSize(30);
			dataSource.setAcquireIncrement(5);
			dataSource.setMaxStatements(30);
			dataSource.setInitialPoolSize(3);
			dataSource.setIdleConnectionTestPeriod(60);
			dataSource.setTestConnectionOnCheckin(false);
			dataSource.setAcquireRetryAttempts(30);
			dataSource.setCheckoutTimeout(0);
			dataSource.setBreakAfterAcquireFailure(false);
			dataSource.setTestConnectionOnCheckout(false);
			
		} catch (PropertyVetoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return dataSource;
	}

	@Bean  //通过该注解来表明是一个Bean对象，相当于xml中的<bean>
	public UserDao getUserDao() {
		return new UserDao();
	}
}
