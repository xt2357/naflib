package naflib;

import java.io.Serializable;

public class Tag implements Serializable {
	
	private static final long serialVersionUID = 1L;

	public Tag() {
		// TODO Auto-generated constructor stub
	}
	
	private String tagName;
	private Integer tagId;
	private double similarity;
	
	public String getTagName() {
		return tagName;
	}
	public void setTagName(String tagName) {
		this.tagName = tagName;
	}
	public Integer getTagId() {
		return tagId;
	}
	public void setTagId(Integer tagId) {
		this.tagId = tagId;
	}
	public double getSimilarity() {
		return similarity;
	}
	public void setSimilarity(double similarity) {
		this.similarity = similarity;
	}
}
