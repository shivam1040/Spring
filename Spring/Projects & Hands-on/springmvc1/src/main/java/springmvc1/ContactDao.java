package springmvc1;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

@Repository //this tells spring that this is dao class and object of this class should be injected to associated variables wherever this class's object is used, use of servie/repository tags allows us to not write configuration in xml such as creationg beans
public class ContactDao {
	
	@Autowired
	private HibernateTemplate hibernateTemplate1;
	
	 @Transactional
	 public int save(Contact contact) {
		 int r=(Integer) this.hibernateTemplate1.save(contact);
		 return r;
	 }

	public HibernateTemplate getHibernateTemplate1() {
		return hibernateTemplate1;
	}

	public void setHibernateTemplate1(HibernateTemplate hibernateTemplate1) {
		this.hibernateTemplate1 = hibernateTemplate1;
	}
	 
	 
}
