package com.flywaystudy.flywaystudy;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@RequiredArgsConstructor
public class MemberController {

  private final MemberService memberService;

  @PostMapping
  public void addUser(){
    memberService.addUser();
  }
}
