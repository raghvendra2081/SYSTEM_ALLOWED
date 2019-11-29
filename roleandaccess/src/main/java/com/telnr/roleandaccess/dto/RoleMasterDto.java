package com.telnr.roleandaccess.dto;

public class RoleMasterDto {
	
	private String roleName;
	private Long id;

	public String getRoleName() {
		return roleName;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

}
