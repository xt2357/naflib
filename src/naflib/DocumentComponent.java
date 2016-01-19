package naflib;

import java.io.Serializable;

public class DocumentComponent implements Serializable {
	
	private static final long serialVersionUID = 1L;

	public DocumentComponent() {
		// TODO Auto-generated constructor stub
	}
	
	private String fieldName;
	private int index;
	
	public String getFieldName() {
		return fieldName;
	}
	public void setFieldName(String fieldName) {
		this.fieldName = fieldName;
	}
	public int getIndex() {
		return index;
	}
	public void setIndex(int index) {
		this.index = index;
	}
}
