package ssii.entity;

import jakarta.persistence.*;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@RequiredArgsConstructor // lombok, pour générer un constructeur avec les champs @NonNull
@ToString
public class Participation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer matricule;

    @NotEmpty
    @NotBlank
    @NonNull // lombok
    private String role;

    @NotEmpty
    @NotBlank
    @NonNull // lombok
    private Float pourcentage;

    @ManyToOne
    private Personne personne;

    @ManyToOne
    private Projet projet;
}
