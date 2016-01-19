package naflib;

import java.io.Serializable;
import java.util.List;

public class KeyWord implements Serializable {
	
	private static final long serialVersionUID = 1L;

	public KeyWord() {
		// TODO Auto-generated constructor stub
	}
	
	private String keyWordText;
	private double weight;
	private int tf;
	List<Mention> mentions;
	
	public String getKeyWordText() {
		return keyWordText;
	}
	public void setKeyWordText(String keyWordText) {
		this.keyWordText = keyWordText;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public int getTf() {
		return tf;
	}
	public void setTf(int tf) {
		this.tf = tf;
	}
	public List<Mention> getMentions() {
		return mentions;
	}
	public void setMentions(List<Mention> mentions) {
		this.mentions = mentions;
	}
}
