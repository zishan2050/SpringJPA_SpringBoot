package com.zishan.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import com.zishan.entity.BloodGroup;

/**
 * @author Zishan Mohsin, Java Developer at Aspiring Wings Technologies
 * @created 9 Aug 2015
 * @modified 9 Aug 2015
 * @summary Repository of BloodGroup entity.
 */

@Transactional
public interface BloodGroupRepository extends JpaRepository<BloodGroup, String>{
	
	
	public BloodGroup findByBloodGroupTypeIgnoreCase(String bloodGroupType);
}
