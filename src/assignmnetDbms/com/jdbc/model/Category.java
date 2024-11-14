package assignmnetDbms.com.jdbc.model;

public class Category {

	private int id ; 
	private String title; 
	private String parentCategory;
	private int countTitle; 
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id; 
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getParentCategory() {
		return parentCategory;
	}
	public void setParentCategory(String parentCategory) {
		this.parentCategory = parentCategory;
	}
	
	
	public int getCountTitle() {
		return countTitle;
	}
	public void setCountTitle(int countTitle) {
		this.countTitle = countTitle;
	}
	@Override
	public String toString() {
		return "Category [id=" + id + ", title=" + title + ", parentCategory=" + parentCategory + "]";
	} 
	
	
	
}
