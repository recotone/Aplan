package com.aplan.app.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ImportResource("classpath:/config/dubbo/dubbo-service.xml")
public class DubboConfig {

}
