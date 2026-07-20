package com.store.store.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
@Table(name = "User")
public class UserEntity {
    @Id
    @GeneratedValue
    private Long id;

    @Column
    private String name;

    @Column
    private String username;

    @Column
    private String email;
}
