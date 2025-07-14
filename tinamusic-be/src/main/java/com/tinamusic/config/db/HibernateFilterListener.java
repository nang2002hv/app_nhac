package com.tinamusic.config.db;


import com.tinamusic.config.interceptor.FilterInterceptor;
import lombok.RequiredArgsConstructor;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
@RequiredArgsConstructor
public class HibernateFilterListener {
    private final FilterInterceptor filterInterceptor;

    @Before("execution(* com.tinamusic.repository..*(..))")
    public void applyFilter() {
        filterInterceptor.enableFilter();
    }

    @After("execution(* com.tinamusic.repository..*(..))") // Xóa sau mỗi request
    public void clearThreadLocal() {
        filterInterceptor.clearThreadLocal();
    }
}
