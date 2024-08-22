package com.archiee.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
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
	

	@GetMapping("/linking/aadhar-card/{accno}/{aadhar}")
	public String aadharupdate(@PathVariable Long accno, @PathVariable long aadhar) {
		Optional<MList> result= repository1.findByaccno(accno);
		if (result.isPresent()) {
            MList mList = result.get();
            mList.setAadharCard(aadhar);
            boolean status = repository1.save(mList)!= null;
			return status? "Successfully updated the Aadhar Card Details!!! Your Account no. is "+accno : "Cant update aadhar card";
        } else {
            // Handle the case where the account is not found
            throw new RuntimeException("Account not found for accno: " + accno);
        }
    }

	@GetMapping("/linking/pan-card/{accno}/{pancard}")
	public String pancardupdate(@PathVariable Long accno, @PathVariable long pancard) {
		
		Optional<MList> result= repository1.findByaccno(accno);
		if (result.isPresent()) {
            MList mList = result.get();
            mList.setPanCard(pancard);
            boolean status = repository1.save(mList)!= null;
			return status? "Successfully updated the Pan Card Details!!! Your Account no. is "+accno : "Cant update Pan card";
        } else {
        
            throw new RuntimeException("Account not found for accno: " + accno);
        }
    }

	
	}
