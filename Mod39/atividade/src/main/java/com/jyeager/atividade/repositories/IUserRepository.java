package com.jyeager.atividade.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.jyeager.atividade.domain.user.User;

import java.util.Optional;

public interface IUserRepository extends JpaRepository<User, Long> {
    Optional<User> findUserByDocument(String document);
    Optional<User> findUserById(Long id);

}
