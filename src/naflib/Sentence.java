package naflib;

import java.io.Serializable;

public class Sentence implements Serializable {
	
	private static final long serialVersionUID = 1L;

	public Sentence() {
		// TODO Auto-generated constructor stub
	}
	
	private String sentenceText;
	private int startTokenIndex, endTokenIndex;
	
	public String getSentenceText() {
		return sentenceText;
	}
	public void setSentenceText(String sentenceText) {
		this.sentenceText = sentenceText;
	}
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
}
