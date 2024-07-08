package dev.garambe.springboot_graphql.users.services;

import dev.garambe.springboot_graphql.users.model.User;
import dev.garambe.springboot_graphql.users.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public Optional<List<User>> getAllUsers() {
        return Optional.of(userRepository.findAll());
    }

    public User createUser(User user) {
        return userRepository.save(user);
    }
}
