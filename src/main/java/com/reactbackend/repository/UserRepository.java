package com.reactbackend.repository;

import com.reactbackend.model.User.User;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface UserRepository extends CrudRepository<User, Long> {
    Optional<User> findByUsername(String username);
    boolean existsByUsername(String username);

    boolean existsByEmail(String email);
    List<User> findByFollowers_Username(String username);




}
