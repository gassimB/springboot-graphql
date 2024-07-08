package dev.garambe.springboot_graphql;

import dev.garambe.springboot_graphql.users.repository.UserRepository;
import dev.garambe.springboot_graphql.users.services.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringbootGraphqlApplication {
	private static final Logger logger = LoggerFactory.getLogger(SpringbootGraphqlApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(SpringbootGraphqlApplication.class, args);
	}


	@Autowired
	UserService userService;
	@Bean
	CommandLineRunner commandLineRunner(UserRepository repository) {
		return args -> {
			logger.info(userService.getAllUsers().toString());
/*            Client client = new Client(null, "CAMARA", "Amaar");
            Client client2 = new Client(null, "DIABY", "Ibrahim");
            repository.saveAll(List.of(
                            client,
                            client2));*/


		};
	}

}
