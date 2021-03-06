package com.kashitkalaecom.brandmodelmgmt.rolepermission;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


@Repository
public interface PermissionRepository extends JpaRepository<Permission, String>{
	
	public Permission getByName(String name);


	@Query("Select c from Permission c where c.id =:id ")
	public Permission getPermissionById(String id);
	
	@Query("Select count(1) from Permission c where c.id =:id ")
	public int permissionIdExists(String id);

	@Query("Select count(1) from Permission c where c.name =:name ")
	public int permissionNameExists(String name);
}
