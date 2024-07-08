package dev.garambe.springboot_graphql.users.model;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column( name = "userid")
    private Integer userId;

    private String nom;

    private String prenom;

    private String email;


    public User() {
    }

    public User(Integer userId, String nom, String prenom, String email) {
        this.userId = userId;
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
    }

    public User(String nom, String prenom, String email) {
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }


    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User user)) return false;
        return Objects.equals(userId, user.userId) && Objects.equals(nom, user.nom) && Objects.equals(prenom, user.prenom) && Objects.equals(email, user.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId, nom, prenom, email);
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
