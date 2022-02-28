package springMVCCRUDProject;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;

@Component
public class ProductDao {
	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	@Transactional
	public void create(Product product) {
		this.hibernateTemplate.saveOrUpdate(product);
	}
	
	public List<Product> getAll(){
		List<Product> list1=this.hibernateTemplate.loadAll(Product.class);
		return list1;
	}
	
	@Transactional
	public void delete(int id) {
		Product product=this.hibernateTemplate.load(Product.class, id);
		this.hibernateTemplate.delete(product);
	}
	
	public Product get(int id) {
		return this.hibernateTemplate.get(Product.class, id);
	}
}