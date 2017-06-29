package yand.util.defenseSpider;

import javax.servlet.*;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by yanzz on 2017/4/5.
 * 写一个servlet进行过滤爬虫
 */
public class DeSpider implements Filter {

    private int count = 0;


    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest)servletRequest;
        //获取该客户端的ip地址
        String ip = null;
        ip = request.getHeader("x-forwarded-for");
        if(ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getRemoteAddr();
        }
        //判断该ip是否存在于ip黑名单中若存在于黑名单则跳转验证码
        /**
         * 在redis存放的ip黑名单里面对于该ip地址进行判断是否存在，若存在于这个黑名单中则进行
         * 弹出 验证码 页面。 如果验证码校验通过，则将该ip地址是释放，黑名单取消
         * 如果不在黑名单中，则对该ip地址的访问次数count 做是否 大于 阀值的操作。
         * 若小于阀值，则进行操作， 若大于的话则将该ip 置放于 黑名单中 并且跳转验证码页面。
         */


    }

    @Override
    public void destroy() {

    }
}
