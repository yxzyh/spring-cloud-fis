package com.fis.cloud.gateway.utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.io.IOUtils;
import org.springframework.stereotype.Component;

/**
 * httpServletRequest 解析工具
 * 
 * @author zhen.Gao
 * @version [产品/模块]
 * @see [相关类/方法]
 * @since [JDK 1.8]
 *
 * [Jul 11, 2019]
 */
@Component
public class HttpServletRequestUtils {

	/**
	 * 获取请求路径url
	 * @param request
	 * @return
	 */
	public String getRequestUri(HttpServletRequest request){
		String url = request.getRequestURI();
		return url;
	}
	
	/**
	 * 获取request方式 post get
	 * @param request
	 * @return
	 */
	public String getRequestMethod(HttpServletRequest request){
		return request.getMethod();
	}
	
	/**
	 * 获取requestBody
	 * @param request
	 * @return
	 */
	public String getRequestBody(HttpServletRequest request){
		BufferedReader bufferedReader;
		String body=null;
		try {
			bufferedReader = new BufferedReader(new InputStreamReader(request.getInputStream()));
			body = IOUtils.toString(bufferedReader);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return body;
	}
	

}
