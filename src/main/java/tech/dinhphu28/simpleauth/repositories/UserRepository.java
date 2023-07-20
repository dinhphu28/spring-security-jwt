package tech.dinhphu28.simpleauth.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tech.dinhphu28.simpleauth.entities.User;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Integer> {

    Optional<User> findByEmail(String email);
}