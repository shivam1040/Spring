package springMVCCRUDProject;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.view.RedirectView;

import jakarta.servlet.http.HttpServletRequest;

@org.springframework.stereotype.Controller
public class Controller {
	@Autowired
	private ProductDao productDao;
	@RequestMapping("/")
	public String home(Model m) {
		List<Product> list1=this.productDao.getAll();
		m.addAttribute("product", list1); //sending data to view after retrieving from DB
		return "home";
	}
	
	@RequestMapping("/add") //show add product form
	public String add(Model m) {
		m.addAttribute("title", "Add"); //sending title parameter here which will be accepted by base jsp page and get included into add jsp as per coding
		return "add";
	}
	
	
	@RequestMapping(value = "/handle", method = RequestMethod.POST) //handles data recieved from view, this can update the data in DB too since saveOrupdate method is used in product dao
	public RedirectView handle(@ModelAttribute Product product, javax.servlet.http.HttpServletRequest request) {
		System.out.println(product);
		RedirectView redirectView=new RedirectView(request.getContextPath()+"/"); //takes to previous visited page or homepage in this case since url wil resolve to localhost:8080/springproductcrud/
		this.productDao.create(product);
		return redirectView;
	}
	
	@RequestMapping("/delete/{id}") //handles delete operation by using uri and pathvariable annotation
	public RedirectView delete(@PathVariable("id") int id, javax.servlet.http.HttpServletRequest request) {
		this.productDao.delete(id);
		RedirectView redirectView=new RedirectView(request.getContextPath()+"/"); //takes to previous visited page or homepage in this case since url wil resolve to localhost:8080/springproductcrud/
		return redirectView;
	}
	
	@RequestMapping("/update/{id}")
	public String update(@PathVariable("id") int id, Model m) {
		Product product=this.productDao.get(id);
		m.addAttribute("product", product);
		return "update";
	}
}
