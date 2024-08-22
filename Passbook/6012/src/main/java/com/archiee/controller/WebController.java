package com.archiee.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import com.archiee.repo.passbookRepository;


@RestController
@RequestMapping("/modules")
//@CrossOrigin(origins = "http://localhost:3000")
public class WebController {
	

	@Autowired
	passbookRepository repository2;

	@Value("${server.port}")
	private int port;

	

	@RequestMapping("/test")  
    public String index(){  
        return"controller logic executed successfully...!!";  
    }  
	

	@PostMapping("/passbook/accno/{accno}")
		public Optional<com.archiee.model.passbook> passbook(@PathVariable long accno){
		Optional<com.archiee.model.passbook> result = repository2.findByaccno(accno);
		return result;
	}

	@PostMapping("/passbook/deposit")
	public HttpStatus deposit(@RequestBody com.archiee.model.passbook passUpdate){
		boolean status = repository2.save(passUpdate) != null;		
		return status? HttpStatus.CREATED : HttpStatus.BAD_REQUEST;
	}

	@PostMapping("/passbook/withdrawl")
	public HttpStatus withdrawl(@RequestBody com.archiee.model.passbook passUpdate){
		boolean status = repository2.save(passUpdate) != null;		
		return status? HttpStatus.CREATED : HttpStatus.BAD_REQUEST;
	}

	
	}
