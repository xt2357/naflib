package naflib;

import java.io.Serializable;

public class MetaInformation implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	public MetaInformation() {
		// TODO Auto-generated constructor stub
	}
	
	private String pubDateTime, url, language;

	public String getPubDateTime() {
		return pubDateTime;
	}

	public void setPubDateTime(String pubDateTime) {
		this.pubDateTime = pubDateTime;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}
}
