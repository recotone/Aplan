/**
 * @ProjectName: aplan-app
 * @Description: 本内容仅限于招商云途内部使用，禁止转发.
 */
package com.aplan.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

/**
 * <p>yangheng</p>
 * @author yh Feb 2, 2017 11:02:44 PM
 * @version V1.0   
 * @date Feb 2, 2017 11:02:44 PM
 */
@SpringBootApplication
@EnableConfigurationProperties
@PropertySources({
                                 @PropertySource("classpath:/config/app/app-${spring.profiles.active}.properties")
                              })
public class APP {
	
	 public static void main(String[] args) {
		    // 设置默认的配置
		    if ((System.getProperty("spring.profiles.active") == null)) {
		        System.setProperty("spring.profiles.active", "dev");
		    }
		    System.setProperty("logback.configurationFile", "config/log/logback-" + System.getProperty("spring.profiles.active") + ".xml");
		    SpringApplication.run(APP.class, args);
	}
}
