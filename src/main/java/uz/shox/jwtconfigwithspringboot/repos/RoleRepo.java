package uz.shox.jwtconfigwithspringboot.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uz.shox.jwtconfigwithspringboot.domains.Role;

/**
 * @author "Berdimurodov Shoxrux"
 * @since 03/11/22 16:57 (Thursday)
 * JWT-config-with-SpringBoot/IntelliJ IDEA
 */
@Repository
public interface RoleRepo extends JpaRepository<Role , Long> {
    public Role findByName(String name);
}
