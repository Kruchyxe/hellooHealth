package pl.kruchyxe.helloohealth.model;


import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "diets")
@Data
@NoArgsConstructor
public class Diets {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="diet_id")
    private Long dietId;

    @NotBlank
    @Column(name="diet_name")
    private String dietName;

    @ManyToOne
    private Customer customer;


}
