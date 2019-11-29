package com.telnr.roleandaccess.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "SYSTEM_ALLOWED")
public class SystemAllowedModel {
	
	@Id
	  @GeneratedValue(strategy = GenerationType.IDENTITY)
	  @Column(name = "ID")
	  private long id;
	 
	 @Column(name = "SYSTEM_ID")
	 private Long systemId;
	 
	 @Column(name = "SECRET_KEY")
	 private Long secretKey;


	public Long getSystemId() {
		return systemId;
	}

	public void setSystemId(Long systemId) {
		this.systemId = systemId;
	}

	public Long getSecretKey() {
		return secretKey;
	}

	public void setSecretKey(Long secretKey) {
		this.secretKey = secretKey;
	}
	
	

	 
}
