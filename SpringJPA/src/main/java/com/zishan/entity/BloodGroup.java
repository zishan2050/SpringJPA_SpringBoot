package com.zishan.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Zishan Mohsin, Java Developer at Aspiring Wings Technologies
 * @created 9 Aug 2015
 * @modified 9 Aug 2015
 * @summary Entity of blood_group_table.
 */

@Entity
@Table(name="blood_group_table")
public class BloodGroup {

	@Id
	@Column(nullable=false)
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	@Column(name="blood_group_type",nullable=false,unique=true)
	private String bloodGroupType;

	public BloodGroup(String bloodGroupType) {
		super();
		this.bloodGroupType = bloodGroupType;
	}
	
	//Default Constructor
	public BloodGroup(){
		
	}

	public long getId() {
		return id;
	}

	public String getBloodGroupType() {
		return bloodGroupType;
	}

	public void setBloodGroupType(String bloodGroupType) {
		this.bloodGroupType = bloodGroupType;
	}

}
