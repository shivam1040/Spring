package springmvc1;

public class StoringDataInClassRefFromVIew {
	private int id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	private String email;
	private String password;
	private Address address;
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "StoringDataInClassRefFromVIew [id=" + id + ", email=" + email + ", password=" + password + ", address="
				+ address + "]";
	}
	
	
}
