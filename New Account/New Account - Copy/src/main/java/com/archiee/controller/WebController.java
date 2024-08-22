package com.archiee.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import com.archiee.model.MList;
import com.archiee.repo.MListRepository;


@RestController
@RequestMapping("/modules")
//@CrossOrigin(origins = "http://localhost:3000")
public class WebController {
	

	@Autowired
	MListRepository repository1;

	@Value("${server.port}")
	private int port;

	

	@RequestMapping("/test")  
    public String index(){  
        return"controller logic executed successfully...!!";  
    }  
	

	@RequestMapping(value="/newAcc",method = RequestMethod.POST)
	public String insertCustomer(@RequestBody MList mList){
                
		boolean status = repository1.save(mList) != null;	
		long id=mList.getAccno();	
		return status? "Successfully added the customer!!! Your Account no. is"+id+"service port : " + port : "Cant add the customer & service port : " + port;
	}
	
	}
