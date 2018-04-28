package com.menglin.redis;

import org.springframework.data.redis.cache.RedisCache;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;


@Component
public class RedisUtil {

    private static final String CACHE_NAME = "VNDais-cache:";
    // 过期时间
    private static final int EXPIRE_TIME = 3000;

    private RedisTemplate template;

    private RedisCache cache;

    public RedisUtil() {
        init();
    }

    private void init() {
        // RedisCacheConfig中定义了
        template = SpringUtil.getBean("redisTemplate");
        cache = new RedisCache(CACHE_NAME, CACHE_NAME.getBytes(), template, EXPIRE_TIME);
    }

    public void put(String key, Object obj) {
        cache.put(key, obj);
    }

    public Object get(String key, Class clazz) {
        return cache.get(key) == null ? null : cache.get(key, clazz);
    }

    public void del(String key) {
        cache.evict(key);
    }
}
