package com.manager.core.users.actions.domain.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;

import java.util.UUID;


@Entity
@Table(name = "users")
@EqualsAndHashCode
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class User {

    @Id
    private UUID id;
    private final String username;
}
