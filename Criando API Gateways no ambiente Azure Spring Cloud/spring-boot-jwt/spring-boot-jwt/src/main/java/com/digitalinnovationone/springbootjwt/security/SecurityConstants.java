package com.digitalinnovationone.springbootjwt.security;

public class SecurityConstants {

    public static final String SECRET = "SecretKeyToGenJWTs";
    public static final long EXPIRATION_TIME = 864_000_000; // 10 Days
    public static final String TOKEN_PREFIX = "Bearer";
    public static final String HEADER_STRING = "Autorization";
    public static final String SIGN_UP_URL = "/login";
    public static final String STATUS_URL = "/status";
}