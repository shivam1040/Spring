package springmvc1;

import java.io.FileOutputStream;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.multipart.commons.CommonsMultipartFile;
import org.springframework.web.servlet.view.RedirectView;

@Controller //tell spring this is a contol layer
public class Controller1 {
	
	@RequestMapping("/one")
	public String one() {
		System.out.println("one");
		return "redirect:/two"; //this is used to redirect to url two, this redirection method is know as prefix method
	}
	
	@RequestMapping("/three")
	public RedirectView three() {
		RedirectView redirectView1=new RedirectView("https://google.com");
		return redirectView1; //redirection using redirectview method
	}
	
	@RequestMapping("/four")
	public String four(HttpServletResponse response) {
		try {
			response.sendRedirect(""); //conventional method of redirection using servlet methods
		}
		catch(Exception e) {
			
		}
		return "";
	}
	
	@RequestMapping("/two")
	public String two() {
		System.out.println("two");
		return "";
	}
	
	@RequestMapping("/classRefEg") //example for storing data from view to class refrence variable
	public String classRefEg() {
		return "StoringViewDataInRefrenClassVar";
	}
	
	@RequestMapping(path="/classRef", method = RequestMethod.POST) //cont. example for storing data from view to class refrence variable
	public String classRef(@ModelAttribute("storingClassRef") StoringDataInClassRefFromVIew storingDataInClassRefFromVIew, BindingResult result) {
		
		if(result.hasErrors()) //this is a kind of exception handling using bindingresult, if any forma data is invalid or has any error the this way can be used to mitigate apt actions
			return "StoringViewDataInRefrenClassVar";
		
		System.out.println(storingDataInClassRefFromVIew);
		return "success";
	}
	
	@RequestMapping("/static") //example for serving static content
	public String static1() {
		return "ServingStaticContent";
	}
	
	@RequestMapping("/fileUpload") //example for file upload
	public String fileUpload() {
		return "FileUpload";
	}
	
	@RequestMapping(path="/uploadFile", method = RequestMethod.POST) //example for file upload cont.
	public String uploadFile(@RequestParam("profile") CommonsMultipartFile commonsMultipartFile, HttpSession session) { //file content is stored in commosmultipartfile obj and mapping is done to value of name attribut in input tag of view
		System.out.println(commonsMultipartFile.getContentType());
		byte[] data=commonsMultipartFile.getBytes(); //stores uploaded data in byte format
		String path=session.getServletContext().getRealPath("/"); //this gets the absolute path of projecct
		path+=commonsMultipartFile.getOriginalFilename(); //this gives file name and saves to temporary path where eclipse compiles this project
		try {
			FileOutputStream fileOutputStream=new FileOutputStream(path);
			fileOutputStream.write(data);
		}
		catch(Exception e) {
			System.out.println("error");
		} 
		return "success";
	}
	
	@RequestMapping("/page/{pageName}") //demonstration of pathvariable annotation using uri variables
	public String pathVariableAnno(@PathVariable("pageName") String name) {
		return name;
	}
	
	@RequestMapping("exception") 
	public void exception() {
		String a=null;
		System.out.println(a.length());
	}
	
	@ResponseStatus(code = HttpStatus.BAD_REQUEST) //this tag is used to manually send response code like 404, 500 etc.
	@ExceptionHandler({Exception.class}) //demonstration of exception handling, apart from exception class other exception classes can also be given for exception handling, this will handle the exception for all url call methods
 	public String exceptionAction(Model m) {
		//above model m can be used to save data for displaying error message in success page
		return "success"; //this exception handler will only work for the current controller
	}
	
	@RequestMapping("/intercept")
	public String springInterceptor() {
		return "springInterceptor";
	}
	
	@RequestMapping("interceptor")
	public String intercept(@RequestParam("email") String email) {
		System.out.println(email);
		return "success";
	}
}