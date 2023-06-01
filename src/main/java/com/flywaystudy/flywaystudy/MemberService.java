package com.flywaystudy.flywaystudy;

import com.flywaystudy.flywaystudy.entity.Member;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MemberService {

  private final MemberRepository memberRepository;

  public void addUser(){
    Member member = new Member();
    memberRepository.save(member);
  }
}
