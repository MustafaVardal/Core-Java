package com.mustafavardal.rest.webservices.restful_web_services.user;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

@RestController
public class UserResource {

	@Autowired
	private UserDaoInmemoryService inmemoryService;

	@GetMapping(path = "/api")
	public List<User> getAll() {
		return inmemoryService.findAll();

	}

	@GetMapping("/api/{id}")
	public EntityModel<User> getById(@PathVariable int id) {
		User user = inmemoryService.getById(id);

		if (user == null) {
			throw new UserNotFoundException("id - " + id);
		}
		
		
		EntityModel<User> entityModel = EntityModel.of(user);
		WebMvcLinkBuilder linkToUsers = linkTo(methodOn(this.getClass()).getAll());
		entityModel.add(linkToUsers.withRel("api"));
		//users
		return entityModel;
		
	}

	/*
	 * @PostMapping(path = "/api") public void add(@RequestBody User user) { User
	 * savedUser = inmemoryService.saveUser(user); }
	 */

	@PostMapping(path = "/api")
	public ResponseEntity<Object> createUser(@Validated @RequestBody User user) {
		User savedUser = inmemoryService.saveUser(user);
		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(savedUser.getId())
				.toUri();
		
		return ResponseEntity.created(location).build();
		
	}

	@DeleteMapping("/api/{id}")
	public void deleteById(@PathVariable int id) {
		User user = inmemoryService.deleteById(id);

		if (user == null) {
			throw new UserNotFoundException("id - " + id);
		}
	
	}
}
