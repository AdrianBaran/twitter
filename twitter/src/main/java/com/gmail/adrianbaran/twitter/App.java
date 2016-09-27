package com.gmail.adrianbaran.twitter;


import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.databind.ObjectMapper;


public class App {

	public static final String API_ENDPOINT = "http://www.mocky.io/v2/57eadc901300005f2263dd81";

	public static void main(String[] args) {

		RestTemplate restTemplate = new RestTemplate();
		
		ResponseEntity<Post[]> httpEntity = restTemplate.getForEntity(
				API_ENDPOINT, Post[].class);
		Post[] resp = httpEntity.getBody();

		
		for (Post post : resp) {
			System.out.println(post.getTitle());
		}
	}
}
