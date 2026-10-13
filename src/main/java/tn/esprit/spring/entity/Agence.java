package tn.esprit.spring.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
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
public class Agence {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idAgence;
    private String nom;
    private String adresse;
    private String telephone;
    private String ville;
}
