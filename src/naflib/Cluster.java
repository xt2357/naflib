package naflib;

import java.io.Serializable;

public class Cluster implements Serializable {

	private static final long serialVersionUID = 1L;
	
	public Cluster() {
		// TODO Auto-generated constructor stub
	}
	
	private String clusterName;
	private int clusterId;
	
	public String getClusterName() {
		return clusterName;
	}
	public void setClusterName(String clusterName) {
		this.clusterName = clusterName;
	}
	public int getClusterId() {
		return clusterId;
	}
	public void setClusterId(int clusterId) {
		this.clusterId = clusterId;
	}
}
