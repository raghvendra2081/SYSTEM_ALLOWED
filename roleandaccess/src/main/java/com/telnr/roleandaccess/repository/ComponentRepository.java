package com.telnr.roleandaccess.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.telnr.roleandaccess.model.ComponentMasterModel;

@Repository
public interface ComponentRepository extends JpaRepository<ComponentMasterModel, Long>{

}
