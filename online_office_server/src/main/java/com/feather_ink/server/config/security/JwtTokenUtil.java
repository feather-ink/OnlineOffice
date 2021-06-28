package com.feather_ink.server.config.security;

import org.springframework.beans.factory.annotation.Value;

public class JwtTokenUtil {

    private static final String CLAIM_KEY_USERNAME = "sub";

    private static final String CLAIM_KEY_CREATED = "created";

    @Value("${jwt.secret}")
    private String secret;

    @Value("${jwt.expiration}")
    private Long expiration;
}
