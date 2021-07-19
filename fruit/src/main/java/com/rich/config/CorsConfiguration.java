package com.rich.config;


import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author: OriginalCoder
 * @Date: 2021/7/19 10:24
 * @Description:
 */


@Configuration
public class CorsConfiguration implements WebMvcConfigurer {

	/**
	 * 设置允许跨域访问
	 *
	 * @param registry 配置注册信息
	 */
	@Override
	public void addCorsMappings(CorsRegistry registry) {
		registry
				//允许访问的接口地址
				.addMapping("/**")
				//允许发起跨域访问的域名
				.allowedOrigins("*")
				//允许跨域访问的方法
				.allowedMethods("GET","HEAD","POST","PUT","DELETE","OPTIONS")
				//是否带上cookie信息
				.allowCredentials(true)
				.maxAge(3600)
				.allowedHeaders("*");
	}
}
