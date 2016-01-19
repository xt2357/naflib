package naflib;

import java.io.Serializable;
import java.util.List;

public class NafLikeDocument implements Serializable {
	
	private static final long serialVersionUID = 1L;

	public NafLikeDocument() {
		// TODO Auto-generated constructor stub
	}
	
	private MetaInformation metaInformation;
	private String title, rawText, text;
	private List<Comment> comments;
	
	private List<TokenSpan> tokenSpans;
	private List<Token> tokens;
	
	private String hashVal;
	private List<Sentence> sentences;
	private List<KeyWord> keyWords;
	private List<Entity> entities;
	private List<Tag> tags;
	private List<Topic> topics;
	private List<Category> categories;
	private List<Cluster> clusters;
	private List<Event> events;
	
	public MetaInformation getMetaInformation() {
		return metaInformation;
	}
	public void setMetaInformation(MetaInformation metaInformation) {
		this.metaInformation = metaInformation;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getRawText() {
		return rawText;
	}
	public void setRawText(String rawText) {
		this.rawText = rawText;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public List<Comment> getComments() {
		return comments;
	}
	public void setComments(List<Comment> comments) {
		this.comments = comments;
	}
	public List<TokenSpan> getTokenSpans() {
		return tokenSpans;
	}
	public void setTokenSpans(List<TokenSpan> tokenSpans) {
		this.tokenSpans = tokenSpans;
	}
	public List<Token> getTokens() {
		return tokens;
	}
	public void setTokens(List<Token> tokens) {
		this.tokens = tokens;
	}
	public String getHashVal() {
		return hashVal;
	}
	public void setHashVal(String hashVal) {
		this.hashVal = hashVal;
	}
	public List<Sentence> getSentences() {
		return sentences;
	}
	public void setSentences(List<Sentence> sentences) {
		this.sentences = sentences;
	}
	public List<KeyWord> getKeyWords() {
		return keyWords;
	}
	public void setKeyWords(List<KeyWord> keyWords) {
		this.keyWords = keyWords;
	}
	public List<Entity> getEntities() {
		return entities;
	}
	public void setEntities(List<Entity> entities) {
		this.entities = entities;
	}
	public List<Tag> getTags() {
		return tags;
	}
	public void setTags(List<Tag> tags) {
		this.tags = tags;
	}
	public List<Topic> getTopics() {
		return topics;
	}
	public void setTopics(List<Topic> topics) {
		this.topics = topics;
	}
	public List<Category> getCategories() {
		return categories;
	}
	public void setCategories(List<Category> categories) {
		this.categories = categories;
	}
	public List<Cluster> getClusters() {
		return clusters;
	}
	public void setClusters(List<Cluster> clusters) {
		this.clusters = clusters;
	}
	public List<Event> getEvents() {
		return events;
	}
	public void setEvents(List<Event> events) {
		this.events = events;
	}
}
