package dev.garambe.springboot_graphql.users.controller;

import dev.garambe.springboot_graphql.users.model.User;
import dev.garambe.springboot_graphql.users.model.UserInput;
import dev.garambe.springboot_graphql.users.services.UserService;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(maxAge = 3600)
@RequestMapping(path = "api/v1/users")
public class UserController {



    UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }


    @QueryMapping
    public Optional<List<User>> getAllUsers() {
        return userService.getAllUsers();
    }

    @MutationMapping
    public User addUser(@Argument String nom, @Argument String prenom, @Argument String email) {
        return userService.createUser(new User(nom, prenom, email));
    }

    @MutationMapping
    public User createUser(@Argument UserInput user) {
        return userService.createUser(new User(user.nom(), user.prenom(), user.email()));
    }
}
