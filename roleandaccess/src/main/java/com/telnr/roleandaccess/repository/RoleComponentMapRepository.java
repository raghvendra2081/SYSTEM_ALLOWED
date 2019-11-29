package com.telnr.roleandaccess.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.telnr.roleandaccess.model.RoleComponentMapModel;

public interface RoleComponentMapRepository extends JpaRepository<RoleComponentMapModel, Long> {

	//RoleComponentMapModel save(List<RoleComponentMapModel> ids);

}
