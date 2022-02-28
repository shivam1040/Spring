package springmvc1;

	import java.util.ArrayList;
import java.util.List;


import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
	@org.springframework.stereotype.Controller //controller tag defines that this class is controller class
	//@RequestMapping("/h") //this means help method will be called by 127.0.0.1/h/help
	public class Controller {
		
		@Autowired
		private ContactService contactService1;
		
		@ModelAttribute //this method contains common instructions required in every url call, so whenever a a url method is called which has modelattribute tag will go through all the instructions inside this common method and contain all the data  given in this common method
		public void common(Model model) {
			model.addAttribute("email", "a");
		}
		
		//@RequestMapping("/home") //when /home is used then this controller method gets fired, which returns name of a view which is index and this name will resolved to index.jsp by viewresolver as per the prefix suffix config in springmvc xml
		@RequestMapping("/")
		public String home(Model model) {
			System.out.println("run");
			model.addAttribute("name", "SJ"); //way to transfer data to view
			List<String> list=new ArrayList<String>();
			list.add("SJ");
			model.addAttribute("list", list);
			return "index";
		}
		
		@RequestMapping(path="/help",method=RequestMethod.GET) //this method will get hit only when the designated url is called by get http method
		public ModelAndView help() { //data transfer using modelandview
			ModelAndView modelAndView1=new ModelAndView();
			modelAndView1.addObject("name1", "SJ1"); //setting data
			modelAndView1.setViewName("help"); //setting view name resolves to help.jsp in views folder of web inf
			return modelAndView1;
		}
		
		@RequestMapping("/contact")
		public String contact() {
			return "contactViewToControllerDataTransfer";
		}
		
		//@RequestMapping(path="/process", method=RequestMethod.POST //OLD METHOD
		//public String process(HttpServletRequest request) {
		//	System.out.println(request.getParameter("email")); //get data from html dom whose name atrribute is email
		//	return "contactViewToControllerDataTransfer";
	//}
		
		/* \\this approach is using Model method for data transfer
		@RequestMapping(path="/process", method=RequestMethod.POST)
		public String process(@RequestParam(name="email", required=false) String email, @RequestParam("password") String password, Model model) {
			System.out.println(email+" "+password); //standard way to get data using annotation and the annotaions use name attribute of html dom for getting data
			model.addAttribute("email", email); //similarly one can create class pojo class containing these data and send the object to view as an object which can be accesssed in view by using getter method
			return "contactViewToControllerDataTransfer";
	}
		*/
		
		//view to controlller data transfer using modelattribute
		@RequestMapping(path="/process", method = RequestMethod.POST)
		public String process(@ModelAttribute Contact contact) { //this annotaion will automatically store the parameter value of html dom to instance of contact class(just ensure to make the name of variable in class similar to parameter name
			System.out.println(contact); 
			this.contactService1.createUser(contact); //injection of data into db by using service layer and dao layer
			return "success"; //in success we jsp we can use expression language to get the value by parameter name
		}
	}