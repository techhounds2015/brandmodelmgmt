package com.kashitkalaecom.brandmodelmgmt.fieldvalidation;

import java.util.HashMap;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.kashitkalaecom.brandmodelmgmt.apiresponse.APIResponse;
import com.kashitkalaecom.brandmodelmgmt.emuns.StatusCodeEnum;
import com.kashitkalaecom.brandmodelmgmt.models.Discount;
import com.kashitkalaecom.brandmodelmgmt.validation.ValidationService;

@Component
public class DiscountFV {

	@Autowired
	ValidationService validationService;

	private static final Logger logger = LoggerFactory.getLogger(DiscountFV.class);

	private static String module = Discount.class.getSimpleName();

	public APIResponse<Discount> fValidateCreate(String tenantCode, Discount discount, String locale) {
		APIResponse<Discount> apiResponse = new APIResponse<>();

		apiResponse.setValidationSuccess(true);
		HashMap<String, String> hashMap = new HashMap<String, String>();
		try {
			hashMap = validateCreate(tenantCode, discount, locale);

		} catch (Exception e) {
			apiResponse.setResponseMessage(StatusCodeEnum.ERROR_ON_VALIDATING_REQUEST.getCode());
			apiResponse.setResponseCode(StatusCodeEnum.ERROR_ON_VALIDATING_REQUEST.getDesc());
			apiResponse.setValidationSuccess(false);
			logger.error("error while validating request", e);
			return apiResponse;
		}
		if (hashMap.size() > 0) {
			apiResponse.setResponseMessage(StatusCodeEnum.INVALID_REQUEST.getCode());
			apiResponse.setResponseCode(StatusCodeEnum.INVALID_REQUEST.getDesc());
			apiResponse.setValidationSuccess(false);
			apiResponse.setErrors(hashMap);

		}
		return apiResponse;

	}

	private HashMap<String, String> validateCreate(String tenantCode, Discount discount, String locale) throws Exception {

		HashMap<String, String> hashMap = new HashMap<>();
		String errorString = null;

		errorString = validationService.validateField(tenantCode, module, discount.getCategoryIds(), "categoryIds", locale);
		if (errorString != null)
			hashMap.put("categoryIds", errorString);

		errorString = validationService.validateField(tenantCode, module, discount.getCode(), "code", locale);
		if (errorString != null)
			hashMap.put("code", errorString);

		errorString = validationService.validateField(tenantCode, module, discount.getDiscount(), "discount",
				locale);
		if (errorString != null)
			hashMap.put("discount", errorString);

		errorString = validationService.validateField(tenantCode, module, discount.getDiscountType(), "discountType", locale);
		if (errorString != null)
			hashMap.put("discountType", errorString);

		errorString = validationService.validateField(tenantCode, module, discount.getMaxDiscount(), "maxDiscount", locale);
		if (errorString != null)
			hashMap.put("maxDiscount", errorString);

		errorString = validationService.validateField(tenantCode, module, discount.getMinPurchase(), "minPurchase", locale);
		if (errorString != null)
			hashMap.put("minPurchase", errorString);

		errorString = validationService.validateField(tenantCode, module, discount.getTitle(), "title", locale);
		if (errorString != null)
			hashMap.put("title", errorString);

		errorString = validationService.validateField(tenantCode, module, discount.getExpiryDate(), "expiryDate", locale);
		if (errorString != null)
			hashMap.put("expiryDate", errorString);

		errorString = validationService.validateField(tenantCode, module, discount.getStartingDate(), "startingDate", locale);
		if (errorString != null)
			hashMap.put("startingDate", errorString);

		errorString = validationService.validateField(tenantCode, module, discount.getStatus(), "status", locale);
		if (errorString != null)
			hashMap.put("status", errorString);

		return hashMap;
	}
}
