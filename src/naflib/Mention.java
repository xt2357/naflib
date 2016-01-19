package naflib;

import java.io.Serializable;

public class Mention implements Serializable {
	
	private static final long serialVersionUID = 1L;

	public Mention() {
		// TODO Auto-generated constructor stub
	}
	
	private String mentionText;
	private Integer startTokenIndex, endTokenIndex;
	
	public String getMentionText() {
		return mentionText;
	}
	public void setMentionText(String mentionText) {
		this.mentionText = mentionText;
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
