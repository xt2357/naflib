package naflib;

import java.io.Serializable;
import java.util.List;

public class TokenSpan implements Serializable {
	
	private static final long serialVersionUID = 1L;

	public TokenSpan() {
		// TODO Auto-generated constructor stub
	}
	
	private int startTokenIndex, endTokenIndex;
	List<DocumentComponent> relatedComponent;
	
	public int getStartTokenIndex() {
		return startTokenIndex;
	}
	public void setStartTokenIndex(int startTokenIndex) {
		this.startTokenIndex = startTokenIndex;
	}
	public int getEndTokenIndex() {
		return endTokenIndex;
	}
	public void setEndTokenIndex(int endTokenIndex) {
		this.endTokenIndex = endTokenIndex;
	}
	public List<DocumentComponent> getRelatedComponent() {
		return relatedComponent;
	}
	public void setRelatedComponent(List<DocumentComponent> relatedComponent) {
		this.relatedComponent = relatedComponent;
	}
}
