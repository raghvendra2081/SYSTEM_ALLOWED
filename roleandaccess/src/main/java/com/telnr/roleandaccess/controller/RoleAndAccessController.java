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

import com.telnr.roleandaccess.dto.RoleMasterDto;
import com.telnr.roleandaccess.model.RoleMasterModel;
import com.telnr.roleandaccess.service.ComponentService;
import com.telnr.roleandaccess.service.RoleService;

@RestController
@RequestMapping("RoleAndAccess")
public class RoleAndAccessController {
	
	@Autowired
	RoleService roleService ;
	
	@Autowired
	ComponentService service1;
	
	@RequestMapping(value = "Role", method = RequestMethod.POST, produces = "application/json")
	public RoleMasterModel createRole(@Valid @RequestBody RoleMasterDto request) throws Exception{
				return roleService.createRole(request) ;
	}
	@RequestMapping(value = "Role/{id}", method = RequestMethod.DELETE, produces = "application/json")
	public ResponseEntity<?> deleteRole(@PathVariable(value = "id") Long roleId) throws Exception{
		return roleService.deleteRole(roleId) ;
	}
	
	@RequestMapping(value = "Role", method = RequestMethod.PUT, produces = "application/json")
	public RoleMasterModel updateRole(@Valid @RequestBody RoleMasterDto request) throws Exception{
				return roleService.updateRole(request) ;
	}
	
	@RequestMapping(value = "Role", method = RequestMethod.GET, produces = "application/json")
	public List<RoleMasterModel> getAllRole() throws Exception{
		return roleService.getAllRole() ;
	}
	
	@RequestMapping(value = "Role/{id}", method = RequestMethod.GET, produces = "application/json")
	public RoleMasterModel getRoleByID(@PathVariable(value = "id") Long roleId) throws Exception{
		return roleService.getRoleByID(roleId) ;
	}
	
	

}