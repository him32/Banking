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
	

	@PostMapping("/Acc_Upd/Fname/{accno}/{firstname}")
	public String FirstNameupdate(@PathVariable Long accno, @PathVariable String firstname) {
		
		Optional<MList> result= repository1.findByaccno(accno);
		if (result.isPresent()) {
            MList mList = result.get();
            mList.setFirstName(firstname);
            boolean status = repository1.save(mList)!= null;
			return status? "Successfully updated the First Name!!! Your Account no. is "+accno : "Cant update Pan card";
        } else {
        
            throw new RuntimeException("Account not found for accno: " + accno);
        }
    }

	@PostMapping("/Acc_Upd/Lname/{accno}/{lastname}")
	public String LastNameupdate(@PathVariable Long accno, @PathVariable String lastname) {
		
		Optional<MList> result= repository1.findByaccno(accno);
		if (result.isPresent()) {
            MList mList = result.get();
            mList.setLastName(lastname);
            boolean status = repository1.save(mList)!= null;
			return status? "Successfully updated the Last Name!!! Your Account no. is "+accno : "Cant update Pan card";
        } else {
        
            throw new RuntimeException("Account not found for accno: " + accno);
        }
    }

	@PostMapping("/Acc_Upd/Contact_no/{accno}/{contactno}")
	public String LastNameupdate(@PathVariable Long accno, @PathVariable Long contactno) {
		
		Optional<MList> result= repository1.findByaccno(accno);
		if (result.isPresent()) {
            MList mList = result.get();
            mList.setContactNo(contactno);
            boolean status = repository1.save(mList)!= null;
			return status? "Successfully updated the Last Name!!! Your Account no. is "+accno : "Cant update Pan card";
        } else {
        
            throw new RuntimeException("Account not found for accno: " + accno);
        }
    }

	
	}
