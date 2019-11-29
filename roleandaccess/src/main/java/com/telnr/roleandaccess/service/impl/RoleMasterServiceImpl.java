package com.telnr.roleandaccess.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.telnr.roleandaccess.dto.RoleMasterDto;
import com.telnr.roleandaccess.model.RoleMasterModel;
import com.telnr.roleandaccess.repository.RoleMasterRepository;
import com.telnr.roleandaccess.service.RoleService;

@Service
public class RoleMasterServiceImpl implements RoleService {

	
	@Autowired
	private RoleMasterRepository roleAndAccessRepository;

	@Override
	public RoleMasterModel createRole(RoleMasterDto request) throws Exception {
		
		RoleMasterModel roleMaster = new RoleMasterModel();
		roleMaster.setRoleName(request.getRoleName());
		//roleMaster.setId(request.getId());
		
		RoleMasterModel rolemastermodel= roleAndAccessRepository.save(roleMaster);
		 return rolemastermodel;
	}

	@Override
	public ResponseEntity<?> deleteRole(Long roleId) throws Exception {
		 roleAndAccessRepository.deleteById(roleId);
		  
		 return ResponseEntity.ok().build();
	}

	@Override
	public RoleMasterModel updateRole(@Valid RoleMasterDto request) throws Exception {
		RoleMasterModel roleMaster = new RoleMasterModel();
		roleMaster.setRoleName(request.getRoleName());
		roleMaster.setId(request.getId());
		
		RoleMasterModel rolemastermodel= roleAndAccessRepository.save(roleMaster);
		 return rolemastermodel;
	}

	@Override
	public List<RoleMasterModel> getAllRole() throws Exception {
		List<RoleMasterModel> list = new ArrayList<>();
			list =  roleAndAccessRepository.findAll();
			return list;
		}
	
	@Override
	public RoleMasterModel getRoleByID(Long roleId) throws Exception {
		Optional<RoleMasterModel> optionalRole = roleAndAccessRepository.findById(roleId);
        return optionalRole.orElseThrow(() -> new Exception("Couldn't find a Role with id: " + roleId));
    }
	
	
	
	

}
