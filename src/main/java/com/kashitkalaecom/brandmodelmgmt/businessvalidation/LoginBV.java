package com.kashitkalaecom.brandmodelmgmt.businessvalidation;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.kashitkalaecom.brandmodelmgmt.apiresponse.APIResponse;
import com.kashitkalaecom.brandmodelmgmt.emuns.StatusCodeEnum;
import com.kashitkalaecom.brandmodelmgmt.models.Product;
import com.kashitkalaecom.brandmodelmgmt.models.User;
import com.kashitkalaecom.brandmodelmgmt.requests.LoginRequest;
import com.kashitkalaecom.brandmodelmgmt.service.LoginService;
import com.kashitkalaecom.brandmodelmgmt.service.ProductService;
import com.kashitkalaecom.brandmodelmgmt.service.UserService;
import com.kashitkalaecom.brandmodelmgmt.utilities.PasswordUtil;
import com.kashitkalaecom.brandmodelmgmt.validation.MasterDataService;

@Component
public class LoginBV {

	@Autowired
	UserService userService;

	@Autowired
	LoginService loginService;

	@Autowired
	LoginBV loginBV;

	private static final Logger logger = LoggerFactory.getLogger(LoginBV.class);

	public APIResponse bValidateCreate(String tenantCode, LoginRequest loginRequest, String locale) {

		APIResponse<User> apiResponse = new APIResponse<>();
		apiResponse.setProcessingSuccess(true);
		try {
			apiResponse = validateCreate(tenantCode, loginRequest, locale);

		} catch (Exception e) {
			apiResponse.setResponseMessage(StatusCodeEnum.INVALID_REQUEST.getDesc());
			apiResponse.setResponseCode(StatusCodeEnum.INVALID_REQUEST.getCode());
			apiResponse.setProcessingSuccess(false);
			logger.error(e.getMessage(), e);
			return apiResponse;
		}

		return apiResponse;
	}

	private APIResponse<User> validateCreate(String tenantCode, LoginRequest loginRequest, String locale) {

		APIResponse<User> apiResponse = new APIResponse<>();
		apiResponse.setProcessingSuccess(true);

		User user = userService.getByUserName(tenantCode, loginRequest.getUserName());

		if (user == null) {
			apiResponse.setResponseCode(StatusCodeEnum.USER_NOT_EXISTS.getCode());
			apiResponse.setResponseMessage(StatusCodeEnum.USER_NOT_EXISTS.getDesc());
			apiResponse.setProcessingSuccess(false);
			return apiResponse;
		}

		String passord = PasswordUtil.encryptedPassword(loginRequest.getPassword(), user.getSalt());
		if (!passord.equals(user.getPassword())) {
			apiResponse.setResponseCode(StatusCodeEnum.INVALID_CREDENTIAL.getCode());
			apiResponse.setResponseMessage(StatusCodeEnum.INVALID_CREDENTIAL.getDesc());
			apiResponse.setProcessingSuccess(false);
			return apiResponse;
		}

		apiResponse.setResponseObject(user);
		return apiResponse;
	}

}
