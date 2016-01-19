package naflib;

import java.io.Serializable;

public class Comment implements Serializable {
	
	private static final long serialVersionUID = 1L;

	public Comment() {
		// TODO Auto-generated constructor stub
	}
	
	private String publisher, pubDateTime, title, rawText, text;

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public String getPubDateTime() {
		return pubDateTime;
	}

	public void setPubDateTime(String pubDateTime) {
		this.pubDateTime = pubDateTime;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getRawText() {
		return rawText;
	}

	public void setRawText(String rawText) {
		this.rawText = rawText;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}
}
