package com.kashitkalaecom.brandmodelmgmt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kashitkalaecom.brandmodelmgmt.models.DeliverySlots;

@Repository
public interface DeliverySlotsRepositroy extends JpaRepository<DeliverySlots, String>{

}
