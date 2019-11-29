package com.telnr.roleandaccess.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.telnr.roleandaccess.model.RoleComponentMapModel;
import com.telnr.roleandaccess.repository.RoleComponentMapRepository;
import com.telnr.roleandaccess.service.RoleComponentMapService;

@Service
public class RoleComponentMapServiceImpl  implements RoleComponentMapService{
	
	@Autowired
	private RoleComponentMapRepository repository;
	
	@Override
	@Transactional(propagation = Propagation.REQUIRED, rollbackFor = { Exception.class })
	public List<RoleComponentMapModel> createComponent(List<RoleComponentMapModel> ids) throws Exception {
		List<RoleComponentMapModel> model = new ArrayList<>();
		try {
			 model = repository.saveAll(ids);
		} catch (Exception e) {
			throw new Exception(e);
		}
		return model;
	}
	
	@Override
	public ResponseEntity<?> deleteComponent(Long compntId) throws Exception {
		repository.deleteById(compntId);
		  
		 return ResponseEntity.ok().build();
	}

	/*@Override
	public RoleComponentMapModel updateComponent(@Valid RoleComponentMapDto request) throws Exception {
		RoleComponentMapModel featureMaster = new RoleComponentMapModel();
		featureMaster.setCompntName(request.getCompntName());
		featureMaster.setId(request.getId());
		
		ComponentMasterModel mastermodel= repository.save(featureMaster);
		 return mastermodel;
	}*/

	@Override
	public List<RoleComponentMapModel> getAllComponent() throws Exception {
		List<RoleComponentMapModel> list = new ArrayList<>();
			list =  repository.findAll();
			return list;
		}
	
	@Override
	public RoleComponentMapModel getComponentByID(Long compntId) throws Exception {
		Optional<RoleComponentMapModel> optionalRole = repository.findById(compntId);
        return optionalRole.orElseThrow(() -> new Exception("Couldn't find a Component with id: " + compntId));
    }

}
