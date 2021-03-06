package com.kashitkalaecom.brandmodelmgmt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.kashitkalaecom.brandmodelmgmt.models.Webpages;

@Repository
public interface WebpagesRepository extends  JpaRepository<Webpages, String> {

	@Query(" from Webpages w where w.title =:title ")
	Webpages findByName(String title);
}
