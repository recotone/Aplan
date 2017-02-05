/**
 * Copyright (c) @2015,重庆云途交通科技有限公司.版权所有
 */
package com.aplan.app.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;


/**
 * 任务配置
 * 
 * @author chenjunpeng
 * @since 1.0.0
 * @Date 2015-8-25
 */
@Component
@Configuration
@ConfigurationProperties(prefix = "redis")
public class RedisConfig {

  private String imageHostAndPort;// 图片组装redis集群

  /**
   * @return the imageHostAndPort
   */
  public String getImageHostAndPort() {
    return imageHostAndPort;
  }

  /**
   * @param imageHostAndPort the imageHostAndPort to set
   */
  public void setImageHostAndPort(String imageHostAndPort) {
    this.imageHostAndPort = imageHostAndPort;
  }

/*  @Bean
  public RedisCluster redisCluster() throws Exception {
    RedisCluster cluster = new RedisCluster(imageHostAndPort);
    return cluster;
  }*/
}
