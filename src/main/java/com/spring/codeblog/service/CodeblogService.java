package com.spring.codeblog.service;

import java.util.List;

import com.spring.codeblog.model.Post;

public interface CodeblogService {
	
	List<Post> findall();
	Post findById(Long id);
	Post save(Post post);
	
}
