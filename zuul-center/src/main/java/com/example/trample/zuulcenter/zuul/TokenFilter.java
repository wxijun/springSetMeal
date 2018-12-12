package com.example.trample.zuulcenter.zuul;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.apache.http.protocol.RequestContent;

import javax.servlet.http.HttpServletRequest;

/**
 * @ClassName TokenFilter
 * @Description TODO
 * @Author wangxijun
 * @Date 2018/12/12 16:17
 * @Version 1.0
 **/
public class TokenFilter extends ZuulFilter {
//    四种类型：pre,routing,error,post
//    1.pre：可以在请求被路由之前调用，用在路由映射的阶段是寻找路由映射表的
//　　2.route：在路由请求时候被调用，具体的路由转发过滤器是在routing路由器具体的请求转发的时候会调用
//　　3.error：处理请求时发生错误时被调用
//　　4.post：当routing，error运行完后才会调用该过滤器，是在最后阶段的
    @Override
    public String filterType() {
        return "pre";
    }

    //自定义过滤器执行的顺序，数值越大越靠后执行，越小就越先执行
    @Override
    public int filterOrder() {
        return 0;
    }

    //控制过滤器生效不生效，可以在里面写一串逻辑来控制
    @Override
    public boolean shouldFilter() {
        return true;
    }

    //执行过滤逻辑
    @Override
    public Object run() throws ZuulException {
        RequestContext context = RequestContext.getCurrentContext();
        HttpServletRequest request = context.getRequest();
        String token = request.getParameter("token");
        if(token == null){
            context.setSendZuulResponse(false);
            context.setResponseStatusCode(401);
            context.setResponseBody("token为空");
            return null;
        }
        return null;
    }
}
