package com.event.users.configure;

public class Constants {
    private Constants() {
        throw new IllegalStateException("Utility class");
    }
    public static final String RESPONSE_MESSAGE_KEY = "Message";
    public static final String RESPONSE_MESSAGE_USER_CREATED = "User was created success.";

    public static final String SWAGGER_TITLE_MESSAGE = "User EventManagement API";
    public static final String SWAGGER_DESCRIPTION_MESSAGE = "User microservice";
    public static final String SWAGGER_VERSION_MESSAGE = "1.0.0";
    public static final String SWAGGER_LICENSE_NAME_MESSAGE = "Apache 2.0";
    public static final String SWAGGER_LICENSE_URL_MESSAGE = "http://springdoc.org";
    public static final String SWAGGER_TERMS_OF_SERVICE_MESSAGE = "http://swagger.io/terms/";
}
