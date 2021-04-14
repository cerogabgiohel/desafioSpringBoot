package endPoints;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import models.Post;
import respositories.PostRepository;

@RestController
@RequestMapping("/post")
public class PostEndPoint {
	private final PostRepository dao;
	
	@Autowired
	public PostEndPoint(PostRepository dao) {
		this.dao = dao;
	}
	
	@GetMapping
	public ResponseEntity<?>listAll(){
		return new ResponseEntity<>(dao.findAll(), HttpStatus.OK);
	}
	
	@PostMapping
	public ResponseEntity<?>save(@RequestBody Post post){
		return new ResponseEntity<>(dao.save(post), HttpStatus.OK);
	}
	

}
