package com.kashitkalaecom.brandmodelmgmt.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kashitkalaecom.brandmodelmgmt.utilities.CustomClock;

@Service
public class ModelService {

	@Autowired
	ModelRepository modelRepository;

	public Model getModelById(String modelId) {
		return modelRepository.getById(modelId);
	}

	public Model save(Model model, String requestorId) {
		model.setCreatedBy(requestorId);
		model.setCreatedOn(CustomClock.timestamp());
		return modelRepository.save(model);
	}

	public Model update(Model model, String requestorId) {
		model.setModifiedBy(requestorId);
		model.setModifiedOn(CustomClock.timestamp());
		model.setStatus(false);
		return modelRepository.save(model);
	}

	public Model delete(String id, String requestorId) {
		Model model = modelRepository.getById(id);
		model.setModifiedBy(requestorId);
		model.setModifiedOn(CustomClock.timestamp());
		model.setStatus(false);
		return modelRepository.save(model);
	}

	public Model getModelByName(String name) {
		return modelRepository.findByName(name);
	}

	public int modelIdExists(String modelId) {
		return modelRepository.modelIdExists(modelId);
	}
}
