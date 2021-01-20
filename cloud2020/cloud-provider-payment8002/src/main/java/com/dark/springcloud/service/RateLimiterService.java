package com.dark.springcloud.service;



import com.google.common.util.concurrent.RateLimiter;
import org.springframework.stereotype.Service;

/**
 * @author ：YCK
 * @date ：Created in 2020/11/18 22:21
 * @description：限流
 * @modified By：
 * @version: 1.0$
 */

@Service
public class RateLimiterService {
    /**
     * 每秒只发出5个令牌
     */
    RateLimiter rateLimiter = RateLimiter.create(5.0);

    /**
     * 尝试获取令牌
     * @return
     */
    public boolean tryAcquire(){
        return rateLimiter.tryAcquire();
    }
}
