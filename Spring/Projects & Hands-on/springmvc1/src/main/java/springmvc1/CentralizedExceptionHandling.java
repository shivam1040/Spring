 package springmvc1;

import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice //this tell springmvc that exception handler methods in this class is common for all the controllers, no need to define explicitly in each controllers
public class CentralizedExceptionHandling {
	@ResponseStatus(code = HttpStatus.BAD_REQUEST) //this tag is used to manually send response code like 404, 500 etc.
	@ExceptionHandler({Exception.class}) //demonstration of exception handling, apart from exception class other exception classes can also be given for exception handling, this will handle the exception for all url call methods
 	public String exceptionAction(Model m) {
		//above model m can be used to save data for displaying error message in success page
		return "success"; //this exception handler will only work for the current controller
	}
}
