package naflib;

import java.io.Serializable;
import java.util.List;

public class Entity implements Serializable {
	
	private static final long serialVersionUID = 1L;

	public Entity() {
		// TODO Auto-generated constructor stub
	}
	
	private String entityName, entityType;
	private List<Mention> mentions;
	private EntityLinking entityLinking;
	
	public String getEntityName() {
		return entityName;
	}
	public void setEntityName(String entityName) {
		this.entityName = entityName;
	}
	public String getEntityType() {
		return entityType;
	}
	public void setEntityType(String entityType) {
		this.entityType = entityType;
	}
	public List<Mention> getMentions() {
		return mentions;
	}
	public void setMentions(List<Mention> mentions) {
		this.mentions = mentions;
	}
	public EntityLinking getEntityLinking() {
		return entityLinking;
	}
	public void setEntityLinking(EntityLinking entityLinking) {
		this.entityLinking = entityLinking;
	}
}
