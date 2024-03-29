package com.kashitkalaecom.brandmodelmgmt.emuns;

public enum StatusCodeEnum {
	
    // Brand
    BRAND_CREATED("1001","Brand Created Successfully."),
    BRAND_UPDATED("1002","Brand Updated Successfully."),
    BRAND_CREATION_FAILED("1003","Failed to Create Brand."),
    BRAND_UPDATION_FAILED("1004","Failed to Update Brand."),
    BRAND_NOT_EXISTS("1005","Brand doesn't exists."),
    BRAND_DUPLICATE("1006","Brand already exists."),
    
    
    // Model
    MODEL_CREATED("2001","Model Created Successfully."),
    MODEL_UPDATED("2002","Model Updated Successfully."),
    MODEL_CREATION_FAILED("2003","Failed to Create Model."),
    MODEL_UPDATION_FAILED("2004","Failed to Update Model."),
    MODEL_NOT_EXISTS("2005","Model doesn't exists."),
    MODEL_DUPLICATE("2006","Model already exists."),
    
    
    // Category
    CATEGORY_CREATED("3001","Category Created Successfully."),
    CATEGORY_UPDATED("3002","Category Updated Successfully."),
    CATEGORY_CREATION_FAILED("3003","Failed to Create Category."),
    CATEGORY_UPDATION_FAILED("3004","Failed to Update Category."),
    CATEGORY_NOT_EXISTS("3005","Category doesn't exists."),
    CATEGORY_INVALID("3006","Invalid Category."),
    CATEGORY_DUPLICATE("3007","Category already exists."),
	
	// Outlet
    OUTLET_CREATED("4001","Outlet Created Successfully."),
    OUTLET_UPDATED("4002","Outlet Updated Successfully."),
    OUTLET_CREATION_FAILED("4003","Failed to Create Outlet."),
    OUTLET_UPDATION_FAILED("4004","Failed to Update Outlet."),
    OUTLET_NOT_EXISTS("4005","Outlet doesn't exists."),
    OUTLET_INVALID("4006","Invalid Outlet."),
    OUTLET_DUPLICATE("4007","Outlet already exists."),
	
	// Product
    PRODUCT_CREATED("5001","Product Created Successfully."),
    PRODUCT_UPDATED("5002","Product Updated Successfully."),
    PRODUCT_CREATION_FAILED("5003","Failed to Create Product."),
    PRODUCT_UPDATION_FAILED("5004","Failed to Update Product."),
    PRODUCT_NOT_EXISTS("5005","Product doesn't exists."),
    PRODUCT_DUPLICATE("5006","Product already exists."),
    PRODUCT_ALREADY_EXPIRED("5007","Product is already expired."),
    PRODUCT_MFD_GT_EXPIRY("5008","Mfd date cannot be greated than expiry date."),
	
	// Discount Code
    DISCOUNT_CODE_CREATED("6001","Discount Code Created Successfully."),
    DISCOUNT_CODE_UPDATED("6002","Discount Code Updated Successfully."),
    DISCOUNT_CODE_CREATION_FAILED("6003","Failed to Create Discount Code."),
    DISCOUNT_CODE_UPDATION_FAILED("6004","Failed to Update Discount Code."),
    DISCOUNT_CODE_NOT_EXISTS("6005","Discount Code doesn't exists."),
    DISCOUNT_CODE_INVALID("6006","Invalid Discount Code."),
    DISCOUNT_CODE_DUPLICATE("6007","Discount Code already exists."),
	
	// Referral Code
    REFERRAL_CODE_CREATED("7001","Referral Code Created Successfully."),
    REFERRAL_CODE_UPDATED("7002","Referral Code Updated Successfully."),
    REFERRAL_CODE_CREATION_FAILED("7003","Failed to Create Referral Code."),
    REFERRAL_CODE_UPDATION_FAILED("7004","Failed to Update Referral Code."),
    REFERRAL_CODE_NOT_EXISTS("7005","Discount Code doesn't exists."),
    REFERRAL_CODE_INVALID("6006","Invalid Referral Code."),
    REFERRAL_CODE_DUPLICATE("6007","Referral Code already exists."),
	
	// User
    USER_CREATED("8001","User Created Successfully."),
    USER_UPDATED("8002","User Updated Successfully."),
    USER_CREATION_FAILED("8003","Failed to Create User."),
    USER_UPDATION_FAILED("8004","Failed to Update User."),
    USER_NOT_EXISTS("8005","User doesn't exists."),
    USER_INVALID_EMAIL("8006","Invalid email."),
    USER_DUPLICATE("8007","User already exists."),
    USER_INVALID_PHONE("8008","Invalid Phone."),
    MORETHAN_ONE_USER("8009","More than one user exists."),
    INVALID_CREDENTIAL("8010", "Invalid credentials"),
    USER_LOGIN_FAILED("8011", "Unable to login please try after sometime"),
    USER_PASSWORD_UPDATED("8012","User Password Updated Successfully."),
    USER_PASSWORD_UPDATION_FAILED("8013","User Password Updation failed."),
    USER_PASSWORD_MISMATCH("8014","Password and Confirm Password are not matched."),
    
    
	// Role
    ROLE_CREATED("9001","Role Created Successfully."),
    ROLE_UPDATED("9002","Role Updated Successfully."),
    ROLE_CREATION_FAILED("9003","Failed to Create Role."),
    ROLE_UPDATION_FAILED("9004","Failed to Update Role."),
    ROLE_NOT_EXISTS("9005","Role doesn't exists."),
    ROLE_DUPLICATE("9006","Role already exists."),
    ROLE_INACTIVE("9007","Role is not active."),
	
	// Delivery Configuration
    DELIVERY_CONFIG_CREATED("1101","Delivery Configuration Created Successfully."),
    DELIVERY_CONFIG_UPDATED("1102","Delivery Configuration Updated Successfully."),
    DELIVERY_CONFIG_CREATION_FAILED("1103","Failed to Create Delivery Configuration."),
    DELIVERY_CONFIG_UPDATION_FAILED("1104","Failed to Update Delivery Configuration."),
    DELIVERY_CONFIG_NOT_EXISTS("1105","Failed to Update Delivery Configuration."),
    DELIVERY_CONFIG_INVALID("1106","Invalid Delivery Configuration."),
    DELIVERY_CONFIG_DUPLICATE("1107","Delivery Configuration already exists."),

    // Webpages Configuration
    WEBPAGES_CONFIG_CREATED("1201","Webpages configuration Created Successfully."),
    WEBPAGES_CONFIG_UPDATED("1202","Webpages configuration Updated Successfully."),
    WEBPAGES_CONFIG_CREATION_FAILED("1203","Failed to Create Webpages configuration."),
    WEBPAGES_CONFIG_UPDATION_FAILED("1203","Failed to Update Webpages configuration."),
    WEBPAGES_CONFIG_NOT_EXISTS("1205","Webpages configuration doesn't exists."),
    WEBPAGES_CONFIG_INVALID("1106","Invalid Webpages Configuration."),
    WEBPAGES_CONFIG_DUPLICATE("1107","Webpages Configuration already exists."),
    
    // HomeSlider Configuration
    HOMESLIDER_CONFIG_CREATED("1301","HomeSlider Configuration Created Successfully."),
    HOMESLIDER_CONFIG_UPDATED("1302","HomeSlider Configuration Updated Successfully."),
    HOMESLIDER_CONFIG_CREATION_FAILED("1303","Failed to Create HomeSlider Configuration."),
    HOMESLIDER_CONFIG_UPDATION_FAILED("1304","Failed to Update HomeSlider Configuration."),
    HOMESLIDER_CONFIG_NOT_EXISTS("1305","HomeSlider Configuration doesn't exists."),
    HOMESLIDER_CONFIG_INVALID("1306","Invalid HomeSlider Configuration."),
    HOMESLIDER_CONFIG_DUPLICATE("1307","HomeSlider Configuration already exists."),
    
    // Delivery Slot
    DELIVERY_SLOT_CREATED("1201","Delivery Slot Created Successfully."),
    DELIVERY_SLOT_UPDATED("1202","Delivery Slot Updated Successfully."),
    DELIVERY_SLOT_CREATION_FAILED("1203","Failed to Create Delivery Slot."),
    DELIVERY_SLOT_UPDATION_FAILED("1204","Failed to Update Delivery Slot."),
    DELIVERY_SLOT_NOT_EXISTS("1205","Delivery Slot doesn't exists."),
    
    
    // Notification Template Configuration
    NOTIFICATION_TEMPLATE_CREATED("1301","Notification Template Created Successfully."),
    NOTIFICATION_TEMPLATE_UPDATED("1302","Notification Template Updated Successfully."),
    NOTIFICATION_TEMPLATE_CREATION_FAILED("1303","Failed to Create Notification Template Configuration."),
    NOTIFICATION_TEMPLATE_UPDATION_FAILED("1304","Failed to Update Notification Template Configuration."),
    NOTIFICATION_TEMPLATE_CODE_DUPLCIATE("1305","Notification Template already exists."),
    NOTIFICATION_TEMPLATE_CODE_NOT_EXISTS("1306","Notification Template doesn't exists."),


    // Inventory
    INVENTORY_CREATED("1401","Inventory Created Successfully."),
    INVENTORY_UPDATED("1402","Inventory Updated Successfully."),
    INVENTORY_CREATION_FAILED("1403","Failed to Create Inventory."),
    INVENTORY_UPDATION_FAILED("1404","Failed to Update Inventory."),
    INVENTORY_NOT_EXISTS("1405","Inventory doesn't exists."),
    INVENTORY_SELLEING_PRICE_GT_MRP("1406","Selling Price Cannot be more than MRP."),
    INVENTORY_SELLING_PRICE_NEGATIVE("1407","Selling Price Cannot be less than Zero."),
    INVENTORY_MRP_NEGATIVE("1408","MRP Cannot be less than Zero."),
    INVENTORY_MRP_UPDATED("1409","MRP Updated Successfully."),
    INVENTORY_MRP_UPDATION_FAILED("1410","Failed to Update MRP."),
    INVENTORY_SELLEING_PRICE_UPDATION_FAILED("1411","Failed to Update Selling Price."),
    INVENTORY_SELLING_PRICE_UPDATED("1412","Selling Price Updated Successfully."),
    INVENTORY_SELLING_PRICE_UPDATION_FAILED("1413","Selling Price Updation Failed."),
    INVENTORY_STOCKS_AVAIALBLE_UPDATED("1414","Avaiable Stocks Updated Successfully."),
    INVENTORY_STOCKS_AVAIALBLE_UPDATION_FAILED("1415","Avaiable Stocks Updation Failed."),
    INVENTORY_EXPIRY_DATE_CANNOT_GT_MFG_DATE("1416","Expiry Date Cannot be greater than Manufacturing Date."),
    INVENTORY_EXPIRY_DATE_CANNOT_LT_CURRENT_DATE("1416","Expiry Date Cannot be Less than today's Date."),
    INVENTORY_SAMPLE_FILE_DOWNLOADED("1417","Sample Inventory File Downloaded Successfully."),
    INVENTORY_SAMPLE_FILE_DOWNLOAD_FAILED("1418","Sample Inventory File Download Failed."),
    
    // Permission
    PERMISSION_CREATED("1501","Permission Created Successfully."),
    PERMISSION_UPDATED("1502","Permission Updated Successfully."),
    PERMISSION_CREATION_FAILED("1503","Failed to Create Permission."),
    PERMISSION_UPDATION_FAILED("1504","Failed to Update Permission."),
    PERMISSION_NOT_EXISTS("1505","Permission doesn't exists."),
    PERMISSION_DUPLICATE("1506","Permission already exists."),
    
    
    // Store Settings
    STORE_SETTINGS_CREATED("1601","Store Settings Created Successfully."),
    STORE_SETTINGS_UPDATED("1602","Store Settings Updated Successfully."),
    STORE_NOT_EXISTS("1603","Store doesn't exists."),
    
    // Permission
    ROLE_PERMISSION_MAPPING_CREATED("1701","Role Permission Mapping Created Successfully."),
    ROLE_PERMISSION_MAPPING_UPDATED("1702","Role Permission Mapping  Updated Successfully."),
    ROLE_PERMISSION_MAPPING_CREATION_FAILED("1703","Failed to Create Role Permission Mapping ."),
    ROLE_PERMISSION_MAPPING_UPDATION_FAILED("1704","Failed to Update Role Permission Mapping ."),
    ROLE_PERMISSION_MAPPING_NOT_EXISTS("1705","Role Permission Mapping  doesn't exists."),
    ROLE_PERMISSION_MAPPING_DUPLICATE("1706","Role Permission Mapping  already exists."),
    
    // Order
    ORDER_CREATED("1801","Order Created Successfully."),    
    ORDER_UPDATED("1802","Order Updated Successfully."),
    ORDER_CANCELLED("1803","Order Cancelled Successfully."),
    ORDER_PLACED("1804","Order Placed Successfully."),
    ORDER_CREATION_FAILED("1805", "Order Creation Failed"),
    ORDER_DETAIL_FETCHED("1805", "Order Details fetch sucessfully."),
    ORDER_PLACED_FAILED("1806", "Order is not placed"),
    ORDER_ITEMS_NOT_EXISTS("1505","Order items doesn't exists."),
	
    
	
	// Error while validating request 
    ERROR_ON_VALIDATING_REQUEST("8000","Error while validating request."),
	
	// Invalid Request
    INVALID_REQUEST("1010","Invalid Request."),
	
	// Tenant Code Missing
    TENANT_CODE_MISSING("9000","tenantCode missing from Request header."),
	
	//Common Message for Error while getting records
	ERROR_WHILE_RETREVING_DATA("7000","Error while getting data");
	
	
    private String code;
    private Integer type;
    private String desc;

    public Integer getType() {
		return type;
	}

	StatusCodeEnum(String code, String desc) {
        this.code = code;
        this.desc = desc;
    }
    

    /**
     * gets the http status code
     *
     * @return the status code number
     */
    public String getCode() {
        return code;
    }

    /**
     * get the description
     *
     * @return the description of the status code
     */
    public String getDesc() {
        return desc;
    }

}
