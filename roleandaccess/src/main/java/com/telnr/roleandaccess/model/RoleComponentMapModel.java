package com.telnr.roleandaccess.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "ROLE_COMPONENT_MAP")
public class RoleComponentMapModel {
	
	@Id
	  @GeneratedValue(strategy = GenerationType.IDENTITY)
	  @Column(name = "ID")
	  private long id;
	 
	 @Column(name = "ROLE_ID")
	 private String roleId;
	 
	 @Column(name = "COMPONENT_ID")
	 private String compntId;
	 
	 @Column(name = "COMPONENT_TYPE")
	 private String compntType;
	 
	 @Column(name = "IS_VISIBLE")
	 private String isVisible;
	 
	 @Column(name = "IS_ENABLED")
	 private String isEnable;
	 
	 @Column(name = "IS_ACTIVE")
	 private String isActive;
	 

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getRoleId() {
		return roleId;
	}

	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}

	public String getCompntId() {
		return compntId;
	}

	public void setCompntId(String compntId) {
		this.compntId = compntId;
	}

	public String getCompntType() {
		return compntType;
	}

	public void setCompntType(String compntType) {
		this.compntType = compntType;
	}

	public String getIsVisible() {
		return isVisible;
	}

	public void setIsVisible(String isVisible) {
		this.isVisible = isVisible;
	}

	public String getIsEnable() {
		return isEnable;
	}

	public void setIsEnable(String isEnable) {
		this.isEnable = isEnable;
	}

	public String getIsActive() {
		return isActive;
	}

	public void setIsActive(String isActive) {
		this.isActive = isActive;
	}
	 
	 
	 

}
