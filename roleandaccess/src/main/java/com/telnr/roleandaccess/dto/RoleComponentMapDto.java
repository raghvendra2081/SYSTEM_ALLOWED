package com.telnr.roleandaccess.dto;

public class RoleComponentMapDto {
	
	 private Long id;
	 private String roleId;
	 private String compntId;
	 private String compntType;
	 private String isVisible;
	 private String isEnable;
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
