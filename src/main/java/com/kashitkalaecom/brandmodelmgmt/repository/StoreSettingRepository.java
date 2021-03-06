package com.kashitkalaecom.brandmodelmgmt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.kashitkalaecom.brandmodelmgmt.models.StoreSetting;

@Repository
public interface StoreSettingRepository extends JpaRepository<StoreSetting, String>{
	
	@Query("from StoreSetting s where s.companyName =:companyName ")
	public StoreSetting findByName(String companyName);

}
