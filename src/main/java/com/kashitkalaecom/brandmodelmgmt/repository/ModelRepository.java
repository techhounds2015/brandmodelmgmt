package com.kashitkalaecom.brandmodelmgmt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.kashitkalaecom.brandmodelmgmt.models.Model;

@Repository
public interface ModelRepository extends JpaRepository<Model, String> {

	@Query(" from Model m where m.name =:name ")
	public Model findByName(String name);

}
