package com.yl.springboot.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class User {
  @Id
  @GeneratedValue
  Long id;

  String username;
  String firstName;
  String lastName;
  Date createdDate;
  Date lastAccessed;

  Boolean isActive = Boolean.TRUE;
}