package com.fis.cloud.gateway.filter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMethod;

import com.fis.cloud.gateway.utils.HttpServletRequestUtils;
import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;

/**
 * 授权过滤器
 * @author zhen.Gao
 * @version [产品/模块]
 * @see [相关类/方法]
 * @since [JDK 1.8]
 *
 * [Jul 11, 2019]
 */
@Component
public class AuthFilter extends ZuulFilter {

	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private HttpServletRequestUtils  requestUtils;
	

	@Override
	public String filterType() {
		return "pre";
	}
	
	@Override
	public boolean shouldFilter() {
		return true;
	}

	@Override
	public Object run() throws ZuulException {
		logger.info("AuthFilter>>>>>>>>>");
		RequestContext requestContext = RequestContext.getCurrentContext();
        HttpServletResponse response = requestContext.getResponse();
        HttpServletRequest request = requestContext.getRequest();
        response.setHeader("Access-Control-Allow-Origin","*");
        response.setHeader("Access-Control-Allow-Credentials","true");
        response.setHeader("Access-Control-Allow-Headers","content-type,X-Session-Token");
        response.setHeader("Access-Control-Allow-Methods","POST, GET, PUT, OPTIONS,PATCH, DELETE");
        response.setHeader("Access-Control-Expose-Headers","X-forwared-port, X-forwarded-host");
        response.setHeader("Vary","Origin,Access-Control-Request-Method,Access-Control-Request-Headers");
        if(request.getMethod().equals(RequestMethod.OPTIONS.name())){
        	//不再路由
        	requestContext.setSendZuulResponse(false);
        	requestContext.setResponseStatusCode(200);
        }else{
        	HttpServletRequest httpServletRequest = requestContext.getRequest();
    		String uri = requestUtils.getRequestUri(httpServletRequest);
    		String body = requestUtils.getRequestBody(httpServletRequest);
    		logger.info("请求uri[{}]授权校验>>>>>>>>请求内容content[{}]",uri,body);
    		//authFacility.checkBodyHeader(requestContext);
        }
		
		return null;
	}

	@Override
	public int filterOrder() {
		return 1;
	}

}
