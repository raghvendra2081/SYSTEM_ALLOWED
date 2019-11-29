package com.telnr.roleandaccess.service;

import java.util.List;

import javax.validation.Valid;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.telnr.roleandaccess.dto.RoleMasterDto;
import com.telnr.roleandaccess.model.RoleMasterModel;

@Service("roleService")
public interface RoleService {
	
	public RoleMasterModel createRole(RoleMasterDto request) throws Exception;

	public ResponseEntity<?> deleteRole(Long roleId)throws Exception;

	public RoleMasterModel updateRole(@Valid RoleMasterDto request)throws Exception;

	public List<RoleMasterModel> getAllRole()throws Exception;

	public RoleMasterModel getRoleByID(Long roleId) throws Exception;
	
	


}

