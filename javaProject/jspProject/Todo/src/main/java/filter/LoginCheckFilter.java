package filter;
	
import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
	
@WebFilter("/todo/*")
public class LoginCheckFilter extends HttpFilter implements Filter {
       
	public void destroy() {
		
	}
	
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		//요청에 대한 filter 처리
		System.out.println("LoginCheckFilter...doFilter()...");
		
		HttpSession session = ((HttpServletRequest)request).getSession();
		if(session.isNew() || session.getAttribute("loginInfo") == null) {
			
			System.out.println("로그인이 필요한 페이지 입니다.");
			((HttpServletResponse)response).sendRedirect("/app/login");
			
			return;
		}
		
		chain.doFilter(request, response);
		
		// 응답에 대한 filter 처리
		
		
		
	}
	
	public void init(FilterConfig fConfig) throws ServletException {
	
	}

}
