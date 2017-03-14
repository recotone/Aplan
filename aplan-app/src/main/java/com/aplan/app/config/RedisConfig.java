/**
 * Copyright (c) @2015,重庆云途交通科技有限公司.版权所有
 */
package com.aplan.app.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;

import redis.clients.jedis.JedisShardInfo;


/**
 * 任务配置
 * 
 * @since 1.0.0
 * @Date 2015-8-25
 */
@Configuration
public class RedisConfig {
	
	@Autowired
	JedisConnectionFactory jedisConnectionFactory;
	
	@Autowired
	StringRedisTemplate  redisTemplate;

	@Bean
	public JedisConnectionFactory  getJedisConnectionFactory() throws Exception {
		JedisShardInfo info = new JedisShardInfo("192.168.0.200",6379);
		JedisConnectionFactory jedisConnectionFactory = new JedisConnectionFactory(info);
	  return jedisConnectionFactory;
	}

	@Bean
	public StringRedisTemplate  getStringRedisTemplate() throws Exception {
		StringRedisTemplate stringRedisTemplate = new StringRedisTemplate();
		stringRedisTemplate.setConnectionFactory(jedisConnectionFactory);
	  return stringRedisTemplate;
	}

}
