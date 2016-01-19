package naflib;

import java.io.Serializable;

public class Sentence implements Serializable {
	
	private static final long serialVersionUID = 1L;

	public Sentence() {
		// TODO Auto-generated constructor stub
	}
	
	private String sentenceText;
	private Integer startTokenIndex, endTokenIndex;
	
	public String getSentenceText() {
		return sentenceText;
	}
	public void setSentenceText(String sentenceText) {
		this.sentenceText = sentenceText;
	}
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
}
