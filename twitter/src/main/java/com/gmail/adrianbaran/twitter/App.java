package com.gmail.adrianbaran.twitter;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class App {

	public static final String API_ENDPOINT = "http://www.mocky.io/v2/57eadc901300005f2263dd81";

	public static void main(String[] args) {

		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<Post[]> httpEntity = restTemplate.getForEntity(API_ENDPOINT, Post[].class);
		Post[] resp = httpEntity.getBody();
		
		List<Post> postsList = new ArrayList<Post>(Arrays.asList(resp));
		postsList.add(new Post(100, 10, "Adrian", "Baran"));
		
		for (Post post : postsList) {
			System.out.println(post.getTitle());
		}
	}
}
