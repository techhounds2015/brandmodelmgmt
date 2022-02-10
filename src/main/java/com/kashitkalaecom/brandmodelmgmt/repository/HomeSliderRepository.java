package com.kashitkalaecom.brandmodelmgmt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kashitkalaecom.brandmodelmgmt.models.HomeSlider;

@Repository
public interface HomeSliderRepository extends JpaRepository<HomeSlider, String> {

}
