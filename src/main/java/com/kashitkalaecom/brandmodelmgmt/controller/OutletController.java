package com.kashitkalaecom.brandmodelmgmt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kashitkalaecom.brandmodelmgmt.apiresponse.APIResponse;
import com.kashitkalaecom.brandmodelmgmt.businessvalidation.OutletBV;
import com.kashitkalaecom.brandmodelmgmt.emuns.StatusCodeEnum;
import com.kashitkalaecom.brandmodelmgmt.fieldvalidation.OutletFV;
import com.kashitkalaecom.brandmodelmgmt.models.Outlet;
import com.kashitkalaecom.brandmodelmgmt.service.OutletService;

@RestController
@RequestMapping("/api/v1/outlet")
public class OutletController {

	@Autowired
	OutletService outletService;

	
	@Autowired
	OutletFV outletFV;
	
	@Autowired 
	OutletBV outletBV;
	
	@PostMapping("/create")
	public APIResponse<Outlet> Outlet(@RequestHeader String requestorId, @RequestBody Outlet outlet) {
		APIResponse<Outlet> apiResponse = new APIResponse<Outlet>();
		try {
			apiResponse = outletFV.fValidateCreate(null, outlet, null);
			if (!apiResponse.getValidationSuccess()) {
				return apiResponse;
			}
			apiResponse = outletBV.bValidateCreate(null, outlet, null);
            if (!apiResponse.getProcessingSuccess()) {
                return apiResponse;
            }
			outlet = outletService.save(outlet, requestorId);
			apiResponse.setResponseCode(StatusCodeEnum.OUTLET_CREATED.getCode());
			apiResponse.setResponseMessage(StatusCodeEnum.OUTLET_CREATED.getDesc());
			apiResponse.setResponseObject(outlet);
		} catch (Exception e) {
			apiResponse.setResponseCode(StatusCodeEnum.OUTLET_CREATION_FAILED.getCode());
			apiResponse.setResponseMessage(StatusCodeEnum.OUTLET_CREATION_FAILED.getDesc());
			apiResponse.setResponseObject(outlet);
		}
		return apiResponse;
	}

	@GetMapping("/view/{id}")
	public APIResponse<Outlet> outlet(@RequestHeader String requestorId, @PathVariable("id") String id) {
		APIResponse<Outlet> apiResponse = new APIResponse<Outlet>();
		Outlet outlet = outletService.getOutletById(id);
		if (outlet == null) {
			apiResponse.setResponseCode(StatusCodeEnum.OUTLET_NOT_EXISTS.getCode());
			apiResponse.setResponseCode(StatusCodeEnum.OUTLET_NOT_EXISTS.getDesc());
			apiResponse.setResponseObject(outlet);
			return apiResponse;
		}

		Outlet outlet2 = outletService.getOutletById(id);
		apiResponse.setResponseCode("200");
		apiResponse.setResponseMessage("Success");
		apiResponse.setResponseObject(outlet2);
		return apiResponse;
	}

	
	@PutMapping("/update")
	public APIResponse<Outlet> updateOutlet(@RequestHeader String requestorId, @RequestBody Outlet outlet) {
		APIResponse<Outlet> apiResponse = new APIResponse<Outlet>();
		try {
			outlet = outletService.update(outlet, requestorId);
			apiResponse.setResponseCode(StatusCodeEnum.OUTLET_UPDATED.getCode());
			apiResponse.setResponseMessage(StatusCodeEnum.OUTLET_UPDATED.getCode());
			apiResponse.setResponseObject(outlet);
		} catch (Exception e) {
			apiResponse.setResponseCode(StatusCodeEnum.OUTLET_UPDATION_FAILED.getCode());
			apiResponse.setResponseMessage(StatusCodeEnum.OUTLET_UPDATION_FAILED.getCode());
		}
		return apiResponse;
	}
	
	@PutMapping("/delete/{id}")
	public APIResponse<Outlet> deletebrand(@RequestHeader String requestorId, @PathVariable String id) {

		APIResponse<Outlet> apiResponse = new APIResponse<Outlet>();
		try {
			Outlet outlet = outletService.delete(id, requestorId);
			apiResponse.setResponseCode(StatusCodeEnum.OUTLET_UPDATED.getCode());
			apiResponse.setResponseMessage(StatusCodeEnum.OUTLET_UPDATED.getCode());
			apiResponse.setResponseObject(outlet);
		} catch (Exception e) {
			apiResponse.setResponseCode(StatusCodeEnum.OUTLET_UPDATION_FAILED.getCode());
			apiResponse.setResponseMessage(StatusCodeEnum.OUTLET_UPDATION_FAILED.getCode());
		}
		return apiResponse;
	}


}

	
