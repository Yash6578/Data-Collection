package com.ashokit.datacollection.entity;

import javax.persistence.*;

@Entity
public class CitizenIncome {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CASE_ID")
    Long caseId;

    @Column(name = "CASE_NUM")
    Long caseNum;

    @Column(name = "APPLICATION_ID")
    Long applicationId;

    Long PLAN_ID		NUMBER
}
