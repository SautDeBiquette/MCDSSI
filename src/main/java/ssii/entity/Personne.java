package ssii.entity;

import jakarta.persistence.*;

import jakarta.servlet.http.Part;
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
public class Personne {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer matricule;

    @NotEmpty
    @NotBlank
    @NonNull // lombok
    private String nom;

    @NotEmpty
    @NotBlank
    @NonNull // lombok
    private String prenom;

    @NotEmpty
    @NotBlank
    @NonNull // lombok
    private String poste;

    @ManyToOne
    private Personne superieur;

    @OneToMany (mappedBy = "superieur")
    private List<Personne> subordonees = new ArrayList<>();

    @OneToMany(mappedBy = "personne")
    private List<Participation> participations = new ArrayList<>();
}
