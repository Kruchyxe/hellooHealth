package pl.kruchyxe.helloohealth.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "customers")
@Data
@NoArgsConstructor
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotBlank(message = "First name may not be blank")
//    @Size(min = 1, max = 40)
    private String firstName;

    @NotBlank(message = "Last name may not be blank")
//    @Size(min = 1, max = 40)
    private String lastName;

    @NotBlank(message = "Age may not be blank")
//    @Size(min = 1, max = 2, message = "Age between 1 - 99")
    private int age;

    @NotBlank(message = "Weight may not be blank")
//    @Size(min = 5, max = 6, message = "Provide value in (kg)")
    private double weight;

    @NotBlank(message = "Height may not be blank")
//    @Size(min = 5, max = 6, message = "Provide value in (cm)")
    private double height;

    @NotBlank
    private String gender;

    @OneToMany(mappedBy = "customer")
    private List<Diets> diets = new ArrayList<>();


}
