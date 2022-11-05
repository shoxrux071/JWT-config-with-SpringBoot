package uz.shox.jwtconfigwithspringboot.service;

import org.springframework.stereotype.Service;
import uz.shox.jwtconfigwithspringboot.domains.Role;
import uz.shox.jwtconfigwithspringboot.domains.User;

import java.util.List;

/**
 * @author "Berdimurodov Shoxrux"
 * @since 03/11/22 17:08 (Thursday)
 * JWT-config-with-SpringBoot/IntelliJ IDEA
 */
public interface UserService {
    public User saveUser(User user);
    public Role saveRole(Role role);
    public void addRoleToUser(String username,String roleName);
    public User getUserByUsername(String username);
    public List<User> getUsers();


}
