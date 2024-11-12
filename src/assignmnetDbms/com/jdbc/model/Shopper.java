package assignmnetDbms.com.jdbc.model;

public class Shopper {
	
	private int id; 
	private int userId;
	
	public int getId() {
		return id;
	}
	
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}

	@Override
	public String toString() {
		return "Shopper [id=" + id + ", userId=" + userId + "]";
	} 
	
	
	

}
