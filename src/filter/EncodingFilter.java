package filter;
import java. io. IOException;
import javax. servlet. Filter;
import javax. servlet. FilterChain;
import javax. servlet. FilterConfig;
import javax. servlet. ServletException;
import javax. servlet. ServletRequest;
import javax. servlet. ServletResponse;
import javax.servlet.annotation.WebFilter;

public class EncodingFilter implements Filter {

public void init(FilterConfig config) throws ServletException{}
    public void destory(){}
public void doFilter(ServletRequest request, ServletResponse response,

        FilterChain chain) throws IOException, ServletException {
    request.setCharacterEncoding("UTF-8");
    chain.doFilter(request, response);
}}
