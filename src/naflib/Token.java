package naflib;

import java.io.Serializable;

public class Token implements Serializable {
	
	private static final long serialVersionUID = 1L;

	public Token() {
		// TODO Auto-generated constructor stub
	}
	
	private String tokenText;
	private int start, end;
	private String pos, lemma;
	private int tf, tokenSpanIndex;
	
	public String getTokenText() {
		return tokenText;
	}
	public void setTokenText(String tokenText) {
		this.tokenText = tokenText;
	}
	public int getStart() {
		return start;
	}
	public void setStart(int start) {
		this.start = start;
	}
	public int getEnd() {
		return end;
	}
	public void setEnd(int end) {
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
	public int getTf() {
		return tf;
	}
	public void setTf(int tf) {
		this.tf = tf;
	}
	public int getTokenSpanIndex() {
		return tokenSpanIndex;
	}
	public void setTokenSpanIndex(int tokenSpanIndex) {
		this.tokenSpanIndex = tokenSpanIndex;
	}
}
