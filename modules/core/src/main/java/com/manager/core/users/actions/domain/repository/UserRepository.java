package com.manager.core.users.actions.domain.repository;

import com.manager.core.users.actions.domain.model.User;
import org.springframework.data.repository.ListCrudRepository;

import java.util.UUID;

public interface UserRepository extends ListCrudRepository<User, UUID> {
}
