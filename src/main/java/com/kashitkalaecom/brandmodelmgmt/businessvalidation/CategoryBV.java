package com.kashitkalaecom.brandmodelmgmt.businessvalidation;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.kashitkalaecom.brandmodelmgmt.apiresponse.APIResponse;
import com.kashitkalaecom.brandmodelmgmt.emuns.StatusCodeEnum;
import com.kashitkalaecom.brandmodelmgmt.models.Category;
import com.kashitkalaecom.brandmodelmgmt.service.CategoryService;
import com.kashitkalaecom.brandmodelmgmt.validation.MasterDataService;
@Component
public class CategoryBV {
	
	@Autowired
	MasterDataService masterDataService;
	
	@Autowired
	CategoryService categoryService;
	
	private static final Logger logger = LoggerFactory.getLogger(CategoryBV.class);
	
	 public APIResponse<Category> bValidateCreate(String tenantCode, Category category, String locale) {
		 
		 APIResponse<Category> apiResponse = new APIResponse<>();
		 apiResponse.setProcessingSuccess(true);
		try {
			apiResponse = validateCreate(tenantCode, category, locale);

		} catch (Exception e) {
			apiResponse.setResponseMessage(StatusCodeEnum.INVALID_REQUEST.getDesc());
			apiResponse.setResponseCode(StatusCodeEnum.INVALID_REQUEST.getCode());
			apiResponse.setProcessingSuccess(false);
			logger.error(e.getMessage(), e);
			return apiResponse;
		}
	
		return apiResponse;

}

	private APIResponse<Category> validateCreate(String tenantCode, Category category, String locale) {
		
		APIResponse<Category> apiResponse = new APIResponse<>();
		apiResponse.setProcessingSuccess(true);
      
        
        Category cat = categoryService.getCategoryByName(category.getName());
        
        if (cat != null) {
        	apiResponse.setResponseCode(StatusCodeEnum.CATEGORY_DUPLICATE.getCode());
        	apiResponse.setResponseMessage(StatusCodeEnum.CATEGORY_DUPLICATE.getDesc());
        	apiResponse.setProcessingSuccess(false);
        	return apiResponse;
        }
        
        return apiResponse;
	}

}
