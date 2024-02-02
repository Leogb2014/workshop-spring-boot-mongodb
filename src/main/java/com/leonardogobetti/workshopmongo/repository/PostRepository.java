package com.leonardogobetti.workshopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import org.springframework.stereotype.Repository;

import com.leonardogobetti.workshopmongo.domain.Post;


@Repository
public interface PostRepository extends MongoRepository<Post, String> {

	
	

}
