package tech.dinhphu28.simpleauth;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import tech.dinhphu28.simpleauth.models.RegisterRequest;
import tech.dinhphu28.simpleauth.services.AuthenticationService;

import static tech.dinhphu28.simpleauth.entities.Role.ADMIN;
import static tech.dinhphu28.simpleauth.entities.Role.MANAGER;

@Component
@RequiredArgsConstructor
public class DataInitializer implements CommandLineRunner {

    private final AuthenticationService service;

    @Override
    public void run(String... args) throws Exception {
        var admin = RegisterRequest.builder()
                .firstname("Admin")
                .lastname("Admin")
                .email("admin@mail.com")
                .password("password")
                .role(ADMIN)
                .build();
        System.out.println("Admin token: " + service.register(admin).getAccessToken());

        var manager = RegisterRequest.builder()
                .firstname("Admin")
                .lastname("Admin")
                .email("manager@mail.com")
                .password("password")
                .role(MANAGER)
                .build();
        System.out.println("Manager token: " + service.register(manager).getAccessToken());
    }
}
