package com.mysite.sbb.user;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.security.core.userdetails.User;

import java.util.Optional;

public interface UserRepository extends JpaRepository<SiteUser, Long> {
    Optional<SiteUser> findByusername(String username);
}
