public class Cliente {
	private String name;
	private String email;
	private String address;
	private int age;
	private String userId;

	public Cliente(String name, String email, String address, int age, String userID) {
		this.name = name;
		this.email = email;
		this.address = address;
		this.age = age;
		this.userID = userID;
	}

	public String getUserID() {
		return this.userID;
	}

	public String getAddress() {
		return this.address;
	}
}