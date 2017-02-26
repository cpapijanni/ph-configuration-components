//package com.partyhulchul.zuul.security;
//
//import java.util.Set;
//
//import org.springframework.stereotype.Component;
//
//import com.netflix.zuul.ZuulFilter;
//import com.netflix.zuul.context.RequestContext;
//
//@Component
//public class RelayTokenFilter extends ZuulFilter {
//
//	@Override
//	public Object run() {
//		RequestContext ctx = RequestContext.getCurrentContext();
//
//		Set<String> headers = (Set<String>) ctx.get("ignoredHeaders");
//		headers.remove("authorization");
//
//		return null;
//	}
//
//	@Override
//	public boolean shouldFilter() {
//		return true;
//	}
//
//	@Override
//	public String filterType() {
//		return "pre";
//	}
//
//	@Override
//	public int filterOrder() {
//		return 10000;
//	}
//}
