package com.minstone.config;

import com.minstone.interceptors.TokenInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import javax.annotation.Resource;

/**
 * @Description:
 * @Author: HuangPeiDong
 * @Date: 2020/8/30 10:43
 **/
@Configuration
public class MvcConfiguration implements WebMvcConfigurer {

//    @Autowired
//    private HandlerInterceptor loginInterceptor;
    @Resource
    private TokenInterceptor tokenInterceptor ;
    /**
     * 重写接口中的addInterceptors方法，添加自定义拦截器
     *
     * @param registry
     */
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
//        registry.addInterceptor(loginInterceptor).addPathPatterns("/**");
        registry.addInterceptor(tokenInterceptor).addPathPatterns("/**").excludePathPatterns("/swagger-ui.html","/swagger-resources/**");
    }
}