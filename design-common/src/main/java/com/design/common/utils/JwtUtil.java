package com.design.common.utils;




import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class JwtUtil {

    public static final long EXPIRATION_TIME = 3600_000_000L; // 1000 hour
    public static final String SECRET = "sinotranszhanglongshandonglinyijunanxianggoujie";//please change to your own encryption secret.
    public static final String TOKEN_PREFIX = "Bearer ";


    public static String generateToken(String userId) {
        HashMap<String, Object> map = new HashMap<>();
        //you can put any data in the map
        map.put("userId", userId);
        String jwt = Jwts.builder()
                .setClaims(map)
                .setExpiration(new Date(System.currentTimeMillis() + EXPIRATION_TIME))
                .signWith(SignatureAlgorithm.HS256, SECRET)
                .compact();
        return TOKEN_PREFIX + jwt; //jwt前面一般都会加Bearer
    }




    public static String validateToken(String token) {
        try {
            // parse the token.
            Map<String, Object> body = Jwts.parser()
                    .setSigningKey(SECRET)
                    .parseClaimsJws(token.replace("Bearer ",""))
                    .getBody();
            String userId=body.get("userId").toString();
            return userId;
        }catch (Exception e){
            throw new IllegalStateException("Invalid Token. "+e.getMessage());
        }
    }
}