package com.telnr.roleandaccess.service;

import java.util.List;

import javax.validation.Valid;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.telnr.roleandaccess.dto.ComponentMasterDto;
import com.telnr.roleandaccess.model.ComponentMasterModel;

@Service
public interface ComponentService {
	
	public ComponentMasterModel createComponent(ComponentMasterDto request) throws Exception;

	public ResponseEntity<?> deleteComponent(Long compntId)throws Exception;

	public ComponentMasterModel updateComponent(@Valid ComponentMasterDto request)throws Exception;

	public List<ComponentMasterModel> getAllComponent()throws Exception;

	public ComponentMasterModel getComponentByID(Long compntId) throws Exception;
	
	

}

