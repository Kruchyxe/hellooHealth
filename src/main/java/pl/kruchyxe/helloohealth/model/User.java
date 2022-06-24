package pl.kruchyxe.helloohealth.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "users")
@Data
@NoArgsConstructor
@Getter
@Setter
@ToString
@AllArgsConstructor
public class User {

    private Long id;

    private String firstName;

    private String lastName;

    private String email;

    private String password;
}
