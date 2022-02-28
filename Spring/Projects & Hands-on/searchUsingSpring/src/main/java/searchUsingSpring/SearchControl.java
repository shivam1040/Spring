package searchUsingSpring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class SearchControl {
	
	@RequestMapping("/home")
	private String home() {
		return "home";
	}
	
	@RequestMapping("/search")
	public RedirectView search(@RequestParam("query") String query) {	
		RedirectView redirectView=new RedirectView("https://google.com/search?q="+query);
		return redirectView;
	}
}
