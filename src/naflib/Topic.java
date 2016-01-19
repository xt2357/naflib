package naflib;

import java.io.Serializable;

public class Topic implements Serializable {
	
	private static final long serialVersionUID = 1L;

	public Topic() {
		// TODO Auto-generated constructor stub
	}
	
	private String topicName;
	private Integer topicId;
	
	public String getTopicName() {
		return topicName;
	}
	public void setTopicName(String topicName) {
		this.topicName = topicName;
	}
	public Integer getTopicId() {
		return topicId;
	}
	public void setTopicId(Integer topicId) {
		this.topicId = topicId;
	}
	
}
