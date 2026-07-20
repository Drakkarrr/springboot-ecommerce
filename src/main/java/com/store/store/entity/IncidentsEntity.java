package com.store.store.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "issues")
public class IncidentsEntity {
    @Id
    @GeneratedValue
    private Long id;

    @Column
    private String number;

    @Column
    private String requester;

    @Column
    private String issue;

    @Column
    private String priority;
}
