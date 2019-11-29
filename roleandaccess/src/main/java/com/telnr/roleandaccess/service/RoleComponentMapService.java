package com.telnr.roleandaccess.service;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import com.telnr.roleandaccess.model.RoleComponentMapModel;

@Component
public interface RoleComponentMapService {
	
	public List<RoleComponentMapModel> createComponent(List<RoleComponentMapModel> ids) throws Exception;

	public ResponseEntity<?> deleteComponent(Long roleCompntId)throws Exception;

	//public RoleComponentMapModel updateComponent(@Valid RoleComponentMapDto request)throws Exception;

	public List<RoleComponentMapModel> getAllComponent()throws Exception;

	public RoleComponentMapModel getComponentByID(Long roleCompntId) throws Exception;
	

}
