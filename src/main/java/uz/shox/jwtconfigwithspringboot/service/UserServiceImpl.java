package uz.shox.jwtconfigwithspringboot.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import uz.shox.jwtconfigwithspringboot.domains.Role;
import uz.shox.jwtconfigwithspringboot.domains.User;
import uz.shox.jwtconfigwithspringboot.repos.RoleRepo;
import uz.shox.jwtconfigwithspringboot.repos.UserRepo;

import javax.transaction.Transactional;
import java.util.List;

/**
 * @author "Berdimurodov Shoxrux"
 * @since 03/11/22 17:36 (Thursday)
 * JWT-config-with-SpringBoot/IntelliJ IDEA
 */
@Service
@RequiredArgsConstructor
@Transactional
@Slf4j
public class UserServiceImpl implements UserService{
    private final UserRepo userRepo;
    private final RoleRepo roleRepo;
    @Override
    public User saveUser(User user) {
        log.info("saving new user {} to database",user.getName());
        return userRepo.save(user);
    }

    @Override
    public Role saveRole(Role role) {
        log.info("saving new Role {} to database",role.getName());
        return roleRepo.save(role);
    }

    @Override
    public void addRoleToUser(String username, String roleName) {
        User user = userRepo.findByUsername(username);
        Role role = roleRepo.findByName(roleName);
        user.getRoles().add(role);
    }

    @Override
    public User getUserByUsername(String username) {
        return userRepo.findByUsername(username);
    }

    @Override
    public List<User> getUsers() {
       return userRepo.findAll();
    }
}
