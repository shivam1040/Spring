package springmvc1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service //this tells spring that this class is service class, and inject obj of this class to associated variables
public class ContactService {
	
	@Autowired
	private ContactDao contactDao;
	
	public int createUser(Contact contact) {
		return this.contactDao.save(contact);
	}
}
