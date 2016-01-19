package naflib;

import java.io.Serializable;
import java.util.List;

public class Event implements Serializable{

	private static final long serialVersionUID = 1L;

	public Event() {
		// TODO Auto-generated constructor stub
	}
	
	private String eventName, location, time, description;
	private List<DocumentComponent> relatedComponents;

	public String getEventName() {
		return eventName;
	}
	public void setEventName(String eventName) {
		this.eventName = eventName;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public List<DocumentComponent> getRelatedComponents() {
		return relatedComponents;
	}
	public void setRelatedComponents(List<DocumentComponent> relatedComponents) {
		this.relatedComponents = relatedComponents;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
