package com.example.security;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class JwtUtil {

    private final String SECRET_KEY = "mysecretkeymysecretkeymysecretkey12"; // Learning Purpose only
    private final long EXPIRATION_TIME = 1000 * 60 * 60 * 24; // 24 Hours

    //  Generate JWT
    public String generateToken(String username) {

        Date now = new Date();
        Date expiryDate = new Date(now.getTime() + EXPIRATION_TIME);

        return Jwts.builder()
                .setSubject(username)
                .setIssuedAt(now)
                .setExpiration(expiryDate)
                .signWith(
                        Keys.hmacShaKeyFor(SECRET_KEY.getBytes()),
                        SignatureAlgorithm.HS256
                )
                .compact();
    }

    //  Extract username
    public String extractUsername(String token) {
        Claims claims = Jwts.parser()                                  // parserBuilder() -> for Building while the parser is used for reading
                .verifyWith(Keys.hmacShaKeyFor(SECRET_KEY.getBytes())) // if the token is changed, throws an error
                .build()
                .parseSignedClaims(token)                               // turns into a readable object
                .getPayload();                                           // Extract the payload.[username, expiration time]

        return claims.getSubject();         //Extract username from the token using getSubject
    }

    //  Validate token
    public boolean validateToken(String token) {
        try {
            Jwts.parser()
                    .verifyWith(Keys.hmacShaKeyFor(SECRET_KEY.getBytes()))
                    .build()
                    .parseSignedClaims(token);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
