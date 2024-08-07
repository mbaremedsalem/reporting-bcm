package com.reportingbcm.gestion.security;

public class JwtUtil {

    public final static String SECRET = "sdf51ds5AQe5dv5f5sdf";
    /**
     * 24h validity on tokens
     */
    public final static long VALIDITY = 24 * 60 * 60 * 1000;
    public final static String PREFIX = "Bearer ";
    public final static String JWT_HEADER = "Authorization";
}
