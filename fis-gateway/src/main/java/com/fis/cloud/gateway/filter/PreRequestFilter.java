package com.fis.cloud.gateway.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.netflix.zuul.filters.support.FilterConstants;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;

/**
 * Demo PreRequestFilter
 * 
 * @author keriezhang
 * @date 2018/07/31
 */
@Component
public class PreRequestFilter extends ZuulFilter {

    private static final Logger LOG = LoggerFactory.getLogger(PreRequestFilter.class);


    @Override
    public String filterType() {
        return "pre";
    }

    @Override
    public int filterOrder() {
    	//int值来定义过滤器的执行顺序，数值越小优先级越高
        return FilterConstants.PRE_DECORATION_FILTER_ORDER + 1;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() {
        RequestContext ctx = RequestContext.getCurrentContext();
        HttpServletRequest request = ctx.getRequest();
//        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        LOG.info("send {} request to {}",request.getMethod(),request.getRequestURL().toString());
        return null;
    }
}
