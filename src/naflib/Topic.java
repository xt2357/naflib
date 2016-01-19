package naflib;

import java.io.Serializable;

public class Topic implements Serializable {
	
	private static final long serialVersionUID = 1L;

	public Topic() {
		// TODO Auto-generated constructor stub
	}
	
	private String topicName;
	private int topicId;
	
	public String getTopicName() {
		return topicName;
	}
	public void setTopicName(String topicName) {
		this.topicName = topicName;
	}
	public int getTopicId() {
		return topicId;
	}
	public void setTopicId(int topicId) {
		this.topicId = topicId;
	}
	
}
