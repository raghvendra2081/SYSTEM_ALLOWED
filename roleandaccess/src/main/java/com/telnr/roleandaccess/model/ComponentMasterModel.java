package com.telnr.roleandaccess.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;


@Entity
@Table(name = "COMPONENT_MASTER")
public class ComponentMasterModel {
	
	@Id
	  @GeneratedValue(strategy = GenerationType.IDENTITY)
	  @Column(name = "ID")
	  private long id;
	 
	
	
	 @Column(name = "COMPONENT_NAME")
	 private String compntName;
	 
	 public Long getId() {
	   return id;
	 }

	 public void setId(Long id) {
		this.id = id;
	 }

	 public String getCompntName() {
		return compntName;
	}

	public void setCompntName(String compntName) {
		this.compntName = compntName;
	}


		

}
