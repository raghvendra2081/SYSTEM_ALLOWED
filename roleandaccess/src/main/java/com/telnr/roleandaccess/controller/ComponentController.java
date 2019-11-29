package com.telnr.roleandaccess.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.telnr.roleandaccess.dto.ComponentMasterDto;
import com.telnr.roleandaccess.model.ComponentMasterModel;
import com.telnr.roleandaccess.service.ComponentService;


@RestController
@RequestMapping("Component")
public class ComponentController {
	
	
	
	
	
	@Autowired
	ComponentService componentService ;
	
	@RequestMapping(value = "Component", method = RequestMethod.POST, produces = "application/json")
	public ComponentMasterModel createComponent(@Valid @RequestBody ComponentMasterDto request) throws Exception{
				return componentService.createComponent(request) ;
	}
	@RequestMapping(value = "Component/{id}", method = RequestMethod.DELETE, produces = "application/json")
	public ResponseEntity<?> deleteComponent(@PathVariable(value = "id") Long compntId) throws Exception{
		return componentService.deleteComponent(compntId) ;
	}
	
	@RequestMapping(value = "Component", method = RequestMethod.PUT, produces = "application/json")
	public ComponentMasterModel updateComponent(@Valid @RequestBody ComponentMasterDto request) throws Exception{
				return componentService.updateComponent(request) ;
	}
	
	@RequestMapping(value = "Component", method = RequestMethod.GET, produces = "application/json")
	public List<ComponentMasterModel> getAllComponent() throws Exception{
		return componentService.getAllComponent() ;
	}
	
	@RequestMapping(value = "Component/{id}", method = RequestMethod.GET, produces = "application/json")
	public ComponentMasterModel getComponentByID(@PathVariable(value = "id") Long compntId) throws Exception{
		return componentService.getComponentByID(compntId) ;
	}

}
