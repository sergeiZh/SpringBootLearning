package com.zh.sergei.learn.user.learning.user.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "user_info")
@Entity
public class User {

    @Id
    long id;

    @Column(name = "user_name")
    String name;
}
