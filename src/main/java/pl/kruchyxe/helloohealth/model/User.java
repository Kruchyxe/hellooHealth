package pl.kruchyxe.helloohealth.model;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Table(name = "users")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotBlank(message = "First name may not be blank")
    @Size(min = 1, max = 40)
    private String firstName;

    @NotBlank(message = "Last name may not be blank")
    @Size(min = 1, max = 45)
    private String lastName;

    @NotBlank(message = "Email may not be blank")
    @Size(min=1,max=45)
    @Email(message = "Please provide valid email address")
    private String email;

    @NotBlank(message = "Password may not be blank")
    @Size(min=10)
    private String password;
}
