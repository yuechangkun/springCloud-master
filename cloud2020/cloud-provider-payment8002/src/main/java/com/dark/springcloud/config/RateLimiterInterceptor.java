package com.dark.springcloud.config;


import com.dark.springcloud.service.RateLimiterService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Component
public class RateLimiterInterceptor implements HandlerInterceptor {
    @Resource
    private RateLimiterService accessLimitService;

    private Logger logger = LoggerFactory.getLogger(RateLimiterInterceptor.class);

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        if (!(handler instanceof HandlerMethod)) {
            return true;
        }

        HandlerMethod handlerMethod = (HandlerMethod) handler;
        RateLimiterAnnotation rateLimiterAnnotation = handlerMethod.getMethod().getAnnotation(RateLimiterAnnotation.class);
        if(rateLimiterAnnotation == null) {
            return true;
        }

        if (!accessLimitService.tryAcquire()) {
            logger.info("限流中......");
            return false;
        }
        logger.info("请求成功");
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }
}