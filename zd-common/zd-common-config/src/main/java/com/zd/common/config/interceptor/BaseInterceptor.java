package com.zd.common.config.interceptor;

import com.zd.common.config.logger.Logger;
import com.zd.common.exception.BusinessException;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.DispatcherType;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Enumeration;

/**
 * Created by 江俊升 on 2018/10/9.
 */
public abstract class BaseInterceptor extends HandlerInterceptorAdapter implements HandlerInterceptor {

    protected Logger logger = Logger.getLogger(this.getClass(), this.getLogName());

    public BaseInterceptor() {
    }

    public abstract boolean execute(HttpServletRequest var1, HttpServletResponse var2, Object var3);

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object o) throws Exception {
//        RequestUtil.setRequestId(request);
        String uri = request.getRequestURI();
        this.logger.warn("请求ip: {},uri = {},header = {}", new Object[]{request.getRemoteAddr(), uri, this.getHeader(request)});
        if (DispatcherType.ERROR == request.getDispatcherType()) {
            throw new BusinessException("访问的资源不存在或者无权限");
        } else {
            return this.execute(request, response, o);
        }
    }

    public String getHeader(HttpServletRequest request) {
        StringBuilder str = new StringBuilder();
        Enumeration e = request.getHeaderNames();

        while (e.hasMoreElements()) {
            String key = (String) e.nextElement();
            str.append(key).append(":").append(request.getHeader(key)).append("||");
        }

        return str.toString();
    }

    public String getLogName() {
        return "";
    }
}
