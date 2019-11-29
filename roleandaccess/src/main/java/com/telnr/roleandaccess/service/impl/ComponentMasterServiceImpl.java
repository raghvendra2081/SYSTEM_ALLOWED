package com.telnr.roleandaccess.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.telnr.roleandaccess.dto.ComponentMasterDto;
import com.telnr.roleandaccess.model.ComponentMasterModel;
import com.telnr.roleandaccess.repository.ComponentRepository;
import com.telnr.roleandaccess.service.ComponentService;

@Service
public class ComponentMasterServiceImpl implements ComponentService {

		
	@Autowired
	private ComponentRepository repository;

	
	@Override
	public ComponentMasterModel createComponent(ComponentMasterDto request) throws Exception {
		
		ComponentMasterModel featureMaster = new ComponentMasterModel();
		featureMaster.setCompntName(request.getCompntName());
		//featureMaster.setId(request.getId());
		ComponentMasterModel featuremastermodel= repository.save(featureMaster);
		 return featuremastermodel;
	}

	@Override
	public ResponseEntity<?> deleteComponent(Long compntId) throws Exception {
		repository.deleteById(compntId);
		  
		 return ResponseEntity.ok().build();
	}

	@Override
	public ComponentMasterModel updateComponent(@Valid ComponentMasterDto request) throws Exception {
		ComponentMasterModel featureMaster = new ComponentMasterModel();
		featureMaster.setCompntName(request.getCompntName());
		featureMaster.setId(request.getId());
		
		ComponentMasterModel mastermodel= repository.save(featureMaster);
		 return mastermodel;
	}

	@Override
	public List<ComponentMasterModel> getAllComponent() throws Exception {
		List<ComponentMasterModel> list = new ArrayList<>();
			list =  repository.findAll();
			return list;
		}
	
	@Override
	public ComponentMasterModel getComponentByID(Long compntId) throws Exception {
		Optional<ComponentMasterModel> optionalRole = repository.findById(compntId);
        return optionalRole.orElseThrow(() -> new Exception("Couldn't find a Component with id: " + compntId));
    }

}
