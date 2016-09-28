package com.gmail.adrianbaran.twitter.trends;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Trend {
	
	private String tweet_volume;
	private String name;
	private String query;
	private String url;
	
	public String getTweet_volume() {
		return tweet_volume;
	}
	public void setTweet_volume(String tweet_volume) {
		this.tweet_volume = tweet_volume;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getQuery() {
		return query;
	}
	public void setQuery(String query) {
		this.query = query;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	
}
