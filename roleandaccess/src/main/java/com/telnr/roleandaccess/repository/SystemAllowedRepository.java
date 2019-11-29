package com.telnr.roleandaccess.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.telnr.roleandaccess.model.SystemAllowedModel;

public interface SystemAllowedRepository extends JpaRepository<SystemAllowedModel, Long> {

}
