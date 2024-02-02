package com.leonardogobetti.workshopmongo.services;



import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.leonardogobetti.workshopmongo.domain.Post;
import com.leonardogobetti.workshopmongo.domain.User;
import com.leonardogobetti.workshopmongo.dto.UserDTO;
import com.leonardogobetti.workshopmongo.repository.PostRepository;
import com.leonardogobetti.workshopmongo.repository.UserRepository;
import com.leonardogobetti.workshopmongo.services.exception.ObjectNotFoundException;

@Service
public class PostService {

	@Autowired
	private PostRepository repo;

	public Post findById(String id) {
		Optional<Post> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));

	}

}