package com.telnr.roleandaccess.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.telnr.roleandaccess.model.SystemAllowedModel;
import com.telnr.roleandaccess.repository.SystemAllowedRepository;

@RestController
@RequestMapping("SystemAllowed")
public class SystemAllowedContoroller {
	
	@Autowired
	SystemAllowedRepository reposotory;

	
	@RequestMapping(value = "/systemRegistration", method = RequestMethod.POST, produces = "application/json")
	public SystemAllowedModel createSyatemCredential() throws Exception{
		SystemAllowedModel systemAllowedDto = new SystemAllowedModel();
		
		long leftLimit =  100000000L;
	    long rightLimit = 999999999L;
		Long systemId = leftLimit + (long) (Math.random() * (rightLimit - leftLimit));
		Long secretKey = leftLimit + (long) (Math.random() * (rightLimit - leftLimit));
		
		//systemAllowedDto.setId(2L);
		systemAllowedDto.setSystemId(systemId);
		systemAllowedDto.setSecretKey(secretKey);
		
		systemAllowedDto = reposotory.save(systemAllowedDto) ;
		
		//DAO call 
		
		return  systemAllowedDto;
	}
	
}