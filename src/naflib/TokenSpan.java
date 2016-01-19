package naflib;

import java.io.Serializable;

public class TokenSpan implements Serializable {
	
	private static final long serialVersionUID = 1L;

	public TokenSpan() {
		// TODO Auto-generated constructor stub
	}
	
	private Integer startTokenIndex, endTokenIndex;
	DocumentComponent relatedComponent;
	
	public Integer getStartTokenIndex() {
		return startTokenIndex;
	}
	public void setStartTokenIndex(Integer startTokenIndex) {
		this.startTokenIndex = startTokenIndex;
	}
	public Integer getEndTokenIndex() {
		return endTokenIndex;
	}
	public void setEndTokenIndex(Integer endTokenIndex) {
		this.endTokenIndex = endTokenIndex;
	}
	public DocumentComponent getRelatedComponent() {
		return relatedComponent;
	}
	public void setRelatedComponent(DocumentComponent relatedComponent) {
		this.relatedComponent = relatedComponent;
	}
}
