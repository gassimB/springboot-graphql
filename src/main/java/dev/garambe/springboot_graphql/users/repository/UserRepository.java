package dev.garambe.springboot_graphql.users.repository;

import dev.garambe.springboot_graphql.users.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
}
