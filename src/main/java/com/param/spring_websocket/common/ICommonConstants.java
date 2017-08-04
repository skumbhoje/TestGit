package com.param.spring_websocket.common;

public interface ICommonConstants {

	String ADD = "add";
	String EDIT = "edit";
	String UPDATE = "update";
	String DELETE = "delete";
	String EXISTS = "exists";
	
	String NAME = "name";
	String STATUS = "status";
	String PINCODE = "pincode";
	String TYPE_ID = "typeId";
	
	
	String ADD_EXCEPTION_CODE = "101";
	String UPDATE_EXCEPTION_CODE = "102";
	String DELETE_EXCEPTION_CODE = "103";
	String LIST_EXCEPTION_CODE = "104";
	String ADD_EXCEPTION = "Something went wrong while adding.";
	String UPDATE_EXCEPTION = "Something went wrong while updating.";
	String DELETE_EXCEPTION = "Something went wrong while deleting.";
	String LIST_EXCEPTION = "Something went wrong while fetching.";
	
	boolean TRUE = true;
	boolean FALSE = false;
	
	String ACTIVE = "A";
	String INACTIVE = "I";
	
	Object NULL = null;
	
	String WHITE_SPACE = " ";
	
	String PARENT_IMAGE_SOURCE = "D:/e-commerceImages/";
	String CATEGORY_IMAGE_DIRECTORY = "categoryImage";
	String SUB_CATEGORY_NAME = "subCategoryName";
	String PRODUCT_IMAGE_DIRECTORY = "productImage";
	
	String STRING_SEPRATOR = "/";
	
	int ID_CATEGORY = 1;
	int ID_SUB_CATEGORY = 2;
	int ID_PRODUCT = 3;
	int ID_SUB_PRODUCT = 4;
	int ID_BRAND = 5;
	
	
	String COMPANY_ID= "companyId";
	String USER_ID = "userId";
	String SUB_PRODUCT_ID = "subProductId";
	String SELLER_ID = "sellerId";
	
	String SMTP_HOST = "smtp.gmail.com";
	String SMTP_PORT = "465";
	String SMTP_USER_ID = "arjunpatil3792@gmail.com";
	String SMTP_USER_PWD = "as729399595556";
	
	String MAIL_SUBJECT = "Approval For Seller Registration on ECOM";
	String MAIL_MESSAGE = "Thank you for registration with us...you are approved...!";
	
	//Profile role
	String SELLER = "seller";
	String END_USER = "endUser";
	
	//Order dtls
	String ORDER_ID = "orderId";
}
