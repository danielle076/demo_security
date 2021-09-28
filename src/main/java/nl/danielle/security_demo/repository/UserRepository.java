package nl.danielle.security_demo.repository;

import nl.danielle.security_demo.model.User;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String> {
}
