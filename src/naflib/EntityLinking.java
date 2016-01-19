package naflib;

import java.io.Serializable;

public class EntityLinking implements Serializable {
	
	private static final long serialVersionUID = 1L;

	public EntityLinking() {
		// TODO Auto-generated constructor stub
	}
	
	private String url;

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
}
