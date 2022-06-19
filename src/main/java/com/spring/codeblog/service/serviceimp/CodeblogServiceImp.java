package com.spring.codeblog.service.serviceimp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.codeblog.model.Post;
import com.spring.codeblog.repository.CodeblogRepository;
import com.spring.codeblog.service.CodeblogService;

@Service
public class CodeblogServiceImp implements CodeblogService{

	@Autowired
	private CodeblogRepository  codeblogRepository;
	
	@Override
	public List<Post> findall() {
		return codeblogRepository.findAll();
	}

	@Override
	public Post findById(Long id) {
		return codeblogRepository.findById(id).get();
	}

	@Override
	public Post save(Post post) {
		return codeblogRepository.save(post);
	}

}
