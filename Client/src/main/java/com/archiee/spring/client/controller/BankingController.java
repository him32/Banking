package com.archiee.spring.client.controller;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import com.archiee.spring.client.model.*;;


@RestController
public class BankingController {
	@Autowired
	private RestTemplate template;

	@Autowired
	private MList mList;

	@Autowired
	private passbook passupdate;

	@GetMapping("/test")
	public String test() {
		return "working....";
	}

	@PostMapping("/new-account")
	public String invokeNewAccountService(@RequestBody MList mList) {
		return template.postForObject("http://NEW-ACCOUNT-SERVICE/modules/newAcc/", mList, String.class);
	}
	

	@PostMapping("/linking/aadhar-card/{accno}/{aadhar}")
	public String invokeAadharLinkingService(@PathVariable Long accno, @PathVariable Long aadhar) {
		return template.postForObject("http://AADHAR-PAN-LINKING-SERVICE/modules/linking/aadhar/" + accno + "/" + aadhar,null,String.class);
	}

	@PostMapping("/linking/pan-card/{accno}/{pan}")
	public String invokePanLinkingService(@PathVariable Long accno, @PathVariable Long pan) {
		return template.postForObject("http://AADHAR-PAN-LINKING-SERVICE/modules/linking/pancard/" + accno + "/" + pan,null,String.class);
	}

	@PostMapping("/Acc_Upd/Fname/{accno}/{firstname}")
	public String FirstNameupdate(@PathVariable Long accno, @PathVariable String firstname) {
		return template.postForObject("http://ACCOUNT-UPDATE-SERVICE/modules/Acc_Upd/Fname/" + accno + "/" + firstname,null,String.class);
		
    }

	@PostMapping("/Acc_Upd/Lname/{accno}/{lastname}")
	public String LastNameupdate(@PathVariable Long accno, @PathVariable String lastname) {
		
		return template.postForObject("http://ACCOUNT-UPDATE-SERVICE/modules/Acc_Upd/Lname/" + accno + "/" + lastname,null,String.class);
    }

	@PostMapping("/Acc_Upd/Contact_no/{accno}/{contactno}")
	public String LastNameupdate(@PathVariable Long accno, @PathVariable Long contactno) {
		
		return template.postForObject("http://ACCOUNT-UPDATE-SERVICE/modules/Acc_Upd/Contact_no/" + accno + "/" + contactno,null,String.class);
    }

	@PostMapping("/passbook/accno/{accno}")
	public String passbook(@PathVariable long accno){
		return template.postForObject("http://PASSBOOK-SERVICE/modules/passbook/accno/" + accno,null,String.class);
	}

	@PostMapping("/passbook/deposit")
	public String deposit(@RequestBody com.archiee.spring.client.model.passbook passUpdate){
		return template.postForObject("http://PASSBOOK-SERVICE/modules/passbook/deposit/" ,passUpdate,String.class);
	}

	@PostMapping("/passbook/withdrawl")
	public String withdrawl(@RequestBody com.archiee.spring.client.model.passbook passUpdate){
		return template.postForObject("http://PASSBOOK-SERVICE/modules/passbook/withdrawl/" ,passUpdate,String.class);
	}

}
