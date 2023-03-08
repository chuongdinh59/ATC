package com.athttt.constant;

public class SystemConstant {
    /*Spring security 4: ROLE_ADMIN, Spring security 3 not required*/
    public static final String ADMIN_ROLE = "ROLE_ADMIN";
    /*Spring security 4: ROLE_ADMIN, Spring security 3 not required*/
    public static final String USER_ROLE = "ROLE_USER";
    public static final String MANAGER_ROLE = "MANAGER";
    public static final String HOME = "/trang-chu";
    public static final String ADMIN_HOME = "/admin/home";
    public static final String MODEL = "model";
    public static final String INSERT_SUCCESS = "insert_success";
    public static final String UPDATE_SUCCESS = "update_success";
    public static final String DELETE_SUCCESS = "delete_success";
    public static final String ERROR_SYSTEM = "error_system";
    public static final String ALERT = "alert";
    public static final String MESSAGE_RESPONSE = "messageResponse";
    public static final String PASSWORD_DEFAULT = "123456";
    public static final String CHANGE_PASSWORD_FAIL = "change_password_fail";



    public static final String WHERE_ONE_EQUALS_ONE = "\nWHERE 1 = 1";
    public static final String BUILDING_GROUP_BY = "\nGROUP BY b.id";
    public static final String LIKE_OPERATOR = " LIKE ";
    public static final String EQUAL_OPERATOR = " = ";
    public static final String AND_STATEMENT = "\nAND ";
    public static final String BUILDING_ALIAS = "b.";
    public static final String EMPTY_STRING = "";
    public static final Integer PAGE_SIZE = 12;


    public static final int ACTIVE_STATUS = 1;
    public static final int INACTIVE_STATUS = 0;

    //public static final long ACCESS_TOKEN_VALIDITY_SECONDS = 3600000;//1h
    public static final long ACCESS_TOKEN_VALIDITY_SECONDS = 30000;
    public static final String SIGNING_KEY = "laptrinhjavaweb";
    public static final String TOKEN_PREFIX = "Bearer ";
    public static final String HEADER_STRING = "Authorization";
    public static final String AUTHORITIES_KEY = "scopes";
}
