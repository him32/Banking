package com.archiee.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import com.archiee.model.scheme;
import com.archiee.repo.schemeRepository;


@RestController
@RequestMapping("/modules")
//@CrossOrigin(origins = "http://localhost:3000")
public class WebController {
	

	@Autowired
	schemeRepository repository3;

	@Value("${server.port}")
	private int port;

	

	@RequestMapping("/test")  
    public String index(){  
        return"controller logic executed successfully...!!";  
    }  
	

	@RequestMapping("/findallschemes")
	public List<scheme> findAll(){
		
		return (List<scheme>) repository3.findAll();
	}
	
	@RequestMapping("/findbyidschemes/{id}")
	public Optional<scheme> findById(@PathVariable long id){
		
		return repository3.findBysno(id);
	}

	
	}
