package uz.shox.jwtconfigwithspringboot.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import uz.shox.jwtconfigwithspringboot.domains.User;
import uz.shox.jwtconfigwithspringboot.service.UserService;

import java.util.List;

/**
 * @author "Berdimurodov Shoxrux"
 * @since 03/11/22 18:01 (Thursday)
 * JWT-config-with-SpringBoot/IntelliJ IDEA
 */
@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    @GetMapping("/users")
    public ResponseEntity<List<User>> getUsers() {
        return ResponseEntity.ok().body(userService.getUsers());

    }
}
