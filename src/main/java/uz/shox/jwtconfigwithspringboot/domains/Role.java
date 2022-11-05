package uz.shox.jwtconfigwithspringboot.domains;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @author "Berdimurodov Shoxrux"
 * @since 03/11/22 16:21 (Thursday)
 * JWT-config-with-SpringBoot/IntelliJ IDEA
 */
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long name;

}
