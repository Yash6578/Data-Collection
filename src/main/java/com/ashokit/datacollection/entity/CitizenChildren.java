package com.ashokit.datacollection.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class CitizenChildren {
    @Id
    @GeneratedValue
    @Column(name = "PARENT_ID")
    Long ParentId;
}
