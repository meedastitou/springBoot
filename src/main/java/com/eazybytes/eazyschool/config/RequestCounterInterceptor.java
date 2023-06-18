package com.eazybytes.eazyschool.config;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.extern.slf4j.Slf4j;
@Slf4j
public class RequestCounterInterceptor implements HandlerInterceptor {

    private static int requestCount = 0;

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        // Increment the request count
        requestCount++;
//        System.out.println("==>> " + requestCount);
//        log.info("" + request.getProtocol());
        System.out.println(request.getProtocol() + " -==- " + request.toString());
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        // No implementation needed
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        // No implementation needed
    }

    public static int getRequestCount() {
        return requestCount;
    }
}
