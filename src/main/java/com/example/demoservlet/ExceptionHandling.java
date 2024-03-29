package com.example.demoservlet;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.zalando.problem.spring.web.advice.ProblemHandling;
import org.zalando.problem.spring.web.advice.security.SecurityAdviceTrait;

@ControllerAdvice
public class ExceptionHandling implements ProblemHandling, SecurityAdviceTrait {

  @Override
  public boolean isCausalChainsEnabled() {
    return true;
  }

}