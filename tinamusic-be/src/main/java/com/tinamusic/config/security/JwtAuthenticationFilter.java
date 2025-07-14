package com.tinamusic.config.security;

import ch.qos.logback.core.util.StringUtil;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import org.springframework.web.filter.OncePerRequestFilter;

import java.io.IOException;

@Slf4j
@RequiredArgsConstructor
@Component
public class JwtAuthenticationFilter extends OncePerRequestFilter {
    public static final String TOKEN_HEADER = "Authorization";
    public static final String TOKEN_PREFIX = "Bearer ";



    private String getJwtFromRequest(HttpServletRequest request) {
        String tokenHeard = request.getHeader(TOKEN_HEADER);
        if(StringUtils.hasText(tokenHeard) && tokenHeard.startsWith(TOKEN_PREFIX)){
            return tokenHeard.replace(TOKEN_PREFIX,"");
        }
        return null;
    }

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
        try {
            String jwt = getJwtFromRequest(request);
            if(StringUtils.hasText(jwt) && jwt.startsWith(TOKEN_PREFIX)){

            }
        } catch (Exception e) {
            log.error("Error processing JWT authentication", e);
        } finally {
            filterChain.doFilter(request, response);
        }
    }
}
