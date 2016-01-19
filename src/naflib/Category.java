package naflib;

import java.io.Serializable;

public class Category implements Serializable{

	private static final long serialVersionUID = 1L;

	public Category() {
		// TODO Auto-generated constructor stub
	}
	
	private String categoryName;
	private Integer categoryId;
	
	public String getCategoryName() {
		return categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	public Integer getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
	}
}
