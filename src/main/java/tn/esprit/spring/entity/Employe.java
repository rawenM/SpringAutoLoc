package tn.esprit.spring.entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor //constructeur par defaut
@AllArgsConstructor //constructeur personnalisé
@Builder
@FieldDefaults(level=AccessLevel.PRIVATE)
//persistence des données
public class Employe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idEmploye;
    private String nom;
    private String prenom;
    @Enumerated(EnumType.STRING)
    private RoleEmploye role;
}
