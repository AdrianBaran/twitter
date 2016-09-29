package com.gmail.adrianbaran.twitter;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.gmail.adrianbaran.twitter.trends.TrendWrapper;

public class App {

	public static final String API_ENDPOINT = "http://www.mocky.io/v2/57eadc901300005f2263dd81"; //LINK MOŻE WYGASNĄĆ

	public static void main(String[] args) {

		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<Post[]> httpEntity = restTemplate.getForEntity(API_ENDPOINT, Post[].class);
		Post[] resp = httpEntity.getBody();
		
		List<Post> postsList = new ArrayList<Post>(Arrays.asList(resp));
		postsList.add(new Post(100, 10, "Adrian", "Baran"));
		
		for (Post post : postsList) {
			System.out.println(post.getTitle());
		}
		
		// == TWITTER SECTION ==
		
//		String TWITTER_URL = "https://api.twitter.com/1.1/trends/place.json&id=1&oauth_consumer_key=lt0OUdtVvC4RPBs71Vh5KD9Nu&oauth_nonce=af4c1239cd6dc9cbaf3a112dac2a3298&oauth_signature_method=HMAC-SHA1&oauth_timestamp=1475066995&oauth_token=2436683348-mkq2pRWyRPw6l31YehZlBVK8mCQ6IWnSm5Lg3Lk&oauth_version=1.0";
//		ResponseEntity<TrendWrapper> twitterEntity = restTemplate.getForEntity(TWITTER_URL, TrendWrapper.class);
//		TrendWrapper twitterResp = twitterEntity.getBody();
//		System.out.println(twitterResp);
//		
	}
}
