package naflib;

import java.io.Serializable;

public class Mention implements Serializable {
	
	private static final long serialVersionUID = 1L;

	public Mention() {
		// TODO Auto-generated constructor stub
	}
	
	private String mentionText;
	private int startTokenIndex, endTokenIndex;
	
	public String getMentionText() {
		return mentionText;
	}
	public void setMentionText(String mentionText) {
		this.mentionText = mentionText;
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
