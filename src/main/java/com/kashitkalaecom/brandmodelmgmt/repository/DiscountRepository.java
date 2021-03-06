package com.kashitkalaecom.brandmodelmgmt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.kashitkalaecom.brandmodelmgmt.models.Discount;

@Repository
public interface DiscountRepository  extends JpaRepository<Discount, String> {

	@Query(" from Discount m where m.discount =:discount ")
	Discount findByName(String discount);

	@Query("select count(*) from Discount m where m.id =:id ")
	int discountCodeExists(String id);

	@Query("select count(*) from Discount m where m.code =:code ")
	int discountCodeCodeExists(String code);
}
