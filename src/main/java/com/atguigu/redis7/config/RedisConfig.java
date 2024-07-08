package com.atguigu.redis7.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.GenericToStringSerializer;
import org.springframework.data.redis.serializer.StringRedisSerializer;

/**
 * 功能描述
 *
 * @author: scott
 * @date: 2024年06月30日 8:33
 */

@Configuration
public class RedisConfig {

//    @Bean
//    public RedisTemplate<String, Object> redisTemplate(RedisConnectionFactory redisConnectionFactory) {
//        RedisTemplate<String, Object> template = new RedisTemplate<>();
//        template.setConnectionFactory(redisConnectionFactory);
//
//        // 使用 StringRedisSerializer 来序列化和反序列化 key 值
//        template.setKeySerializer(new StringRedisSerializer());
//        // 使用 JdkSerializationRedisSerializer 来序列化和反序列化 value 值
//        // 你也可以自定义序列化器
//        template.setValueSerializer(new GenericToStringSerializer<>(Object.class));
//
//        template.afterPropertiesSet();
//        return template;
//    }
}