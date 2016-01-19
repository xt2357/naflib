package naflib;

import java.io.Serializable;

public class DocumentComponent implements Serializable {
	
	private static final long serialVersionUID = 1L;

	public DocumentComponent() {
		// TODO Auto-generated constructor stub
	}
	
	private String fieldName;
	private Integer index;
	
	public String getFieldName() {
		return fieldName;
	}
	public void setFieldName(String fieldName) {
		this.fieldName = fieldName;
	}
	public Integer getIndex() {
		return index;
	}
	public void setIndex(Integer index) {
		this.index = index;
	}
}
