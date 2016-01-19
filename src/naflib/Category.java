package naflib;

import java.io.Serializable;

public class Category implements Serializable{

	private static final long serialVersionUID = 1L;

	public Category() {
		// TODO Auto-generated constructor stub
	}
	
	private String categoryName;
	private int categoryId;
	
	public String getCategoryName() {
		return categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	public int getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}
}
