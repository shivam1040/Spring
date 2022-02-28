package springmvc1;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;


public class Interceptor extends HandlerInterceptorAdapter { //we can implement handlerinterceptor if we strictly want to define ll pre post mid filters

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		String name=request.getParameter("email");
		if(name.length()>3) {
			response.setContentType("text/html");
			response.getWriter().println("interceptor false");
			return false;
		}
		System.out.println("prehandler");
		return true;
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("posthandler");
		super.postHandle(request, response, handler, modelAndView);
	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception { //this method runs after posthandler
		// TODO Auto-generated method stub
		System.out.println("after completion"); 
		super.afterCompletion(request, response, handler, ex);
	} 
	
	
}
