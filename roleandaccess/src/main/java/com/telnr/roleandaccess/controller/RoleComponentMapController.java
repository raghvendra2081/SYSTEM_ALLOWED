package com.telnr.roleandaccess.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.telnr.roleandaccess.model.RoleComponentMapModel;
import com.telnr.roleandaccess.service.RoleComponentMapService;

@RestController
@RequestMapping("ComponentRole")
public class RoleComponentMapController {

	@Autowired
	RoleComponentMapService roleComponentService ;
	
	@RequestMapping(value = "Component", method = RequestMethod.POST, produces = "application/json")
	public List<RoleComponentMapModel> createComponent(@RequestBody List<RoleComponentMapModel> ids) throws Exception{
				return roleComponentService.createComponent(ids) ;
	}
	@RequestMapping(value = "Component/{id}", method = RequestMethod.DELETE, produces = "application/json")
	public ResponseEntity<?> deleteComponent(@PathVariable(value = "id") Long compntId) throws Exception{
		return roleComponentService.deleteComponent(compntId) ;
	}
	
	/*@RequestMapping(value = "Component", method = RequestMethod.PUT, produces = "application/json")
	public RoleComponentMapModel updateComponent(@Valid @RequestBody RoleComponentMapDto request) throws Exception{
				return roleComponentService.updateComponent(request) ;
	}*/
	
	@RequestMapping(value = "Component", method = RequestMethod.GET, produces = "application/json")
	public List<RoleComponentMapModel> getAllComponent() throws Exception{
		return roleComponentService.getAllComponent() ;
	}
	
	@RequestMapping(value = "Component/{id}", method = RequestMethod.GET, produces = "application/json")
	public RoleComponentMapModel getComponentByID(@PathVariable(value = "id") Long compntId) throws Exception{
		return roleComponentService.getComponentByID(compntId) ;
	}

}
