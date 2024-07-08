# Spring boot & GraphQL

Depuis [Spring.io](https://start.spring.io/) créer un projet Spring.

Choisir comme dépendances :

- MySQL Driver (si MySQL)
- Spring-boot-starter-web
- Spring-boot-starter-data-jpa ou JDBC
- Spring-boot-starter-graphql


## Créer un fichier schema.graphqls dans le ressource/graphql

````
type Mutation {
    addUser(nom: String, prenom: String, email: String) : user
    createUser(user: inputUser) : user
}

type Query {
    getAllUsers: [user]
}

type user {
    userId: ID!
    nom: String
    prenom: String
    email: String
}

input inputUser {
    nom: String
    prenom: String
    email: String
}
````

### Controller

```` 
@QueryMapping
public Optional<List<User>> getAllUsers() {
    return userService.getAllUsers();
 }
````
### L'interface graphQL : (choisir le bon port)
http://localhost:8090/graphiql?path=/graphql

### Ci-dessous un exemple de requete GraphQL
````
query findAllUsers {
  getAllUsers {
    userId
    nom
    prenom
    email
  }
}

mutation CreateUser {
	createUser(user: {
    nom: "Hollande",
    prenom: "Fred",
    email: "fred.hollande@gmail.fr"
  }) {
    userId
    nom
    prenom
    email
  } 
}

mutation addUser {
  addUser(nom: "Zinedine", prenom: "Zidane", email: "zidane.zinedine@hotmail.fr") {
    userId
    nom
    prenom
    email
  }
}

````
