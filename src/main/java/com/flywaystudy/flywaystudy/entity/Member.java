package com.flywaystudy.flywaystudy.entity;

import jakarta.persistence.*;

@Entity
@SequenceGenerator(name = "MEMBER_ID_SEQ_GEN", sequenceName = "MEMBER_ID_SEQ")
public class Member {

  @Id
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "MEMBER_ID_SEQ_GEN")
  private Long id;

  private String name;

  private String email;

  private String password;

  private String phoneNumber;

  private String address;
}
