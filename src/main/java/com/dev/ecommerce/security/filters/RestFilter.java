package com.dev.ecommerce.security.filters;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Optional;

import static com.dev.ecommerce.security.AppTokenProvider.addAuthentication;
import static com.dev.ecommerce.security.AppTokenProvider.getUserFromToken;


@Component
public class RestFilter implements Filter {

  @Override
  public void init(FilterConfig filterConfig) throws ServletException {
  }

  @Override
  public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse,
      FilterChain filterChain) throws IOException, ServletException {

    HttpServletRequest request = (HttpServletRequest) servletRequest;
    HttpServletResponse response = (HttpServletResponse) servletResponse;

    Optional<String> userFromToken = getUserFromToken(request);

    if (!userFromToken.isPresent()) {
      response.sendError(HttpStatus.UNAUTHORIZED.value());
      return;
    }
    request.setAttribute("userId", userFromToken.get());
    addAuthentication(response, userFromToken.get());
    filterChain.doFilter(request, servletResponse);
  }

  @Override
  public void destroy() {
  }
}
