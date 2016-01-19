package naflib;

import java.io.Serializable;

public class Token implements Serializable {
	
	private static final long serialVersionUID = 1L;

	public Token() {
		// TODO Auto-generated constructor stub
	}
	
	private String tokenText;
	private Integer start, end;
	private String pos, lemma;
	private Integer tf, tokenSpanIndex;
	
	public String getTokenText() {
		return tokenText;
	}
	public void setTokenText(String tokenText) {
		this.tokenText = tokenText;
	}
	public Integer getStart() {
		return start;
	}
	public void setStart(Integer start) {
		this.start = start;
	}
	public Integer getEnd() {
		return end;
	}
	public void setEnd(Integer end) {
		this.end = end;
	}
	public String getPos() {
		return pos;
	}
	public void setPos(String pos) {
		this.pos = pos;
	}
	public String getLemma() {
		return lemma;
	}
	public void setLemma(String lemma) {
		this.lemma = lemma;
	}
	public Integer getTf() {
		return tf;
	}
	public void setTf(Integer tf) {
		this.tf = tf;
	}
	public Integer getTokenSpanIndex() {
		return tokenSpanIndex;
	}
	public void setTokenSpanIndex(Integer tokenSpanIndex) {
		this.tokenSpanIndex = tokenSpanIndex;
	}
}
