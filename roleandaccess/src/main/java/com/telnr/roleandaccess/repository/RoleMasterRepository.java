package com.telnr.roleandaccess.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.telnr.roleandaccess.model.RoleMasterModel;

@Repository
public interface RoleMasterRepository extends JpaRepository<RoleMasterModel, Long>{

}
