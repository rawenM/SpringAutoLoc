package tn.esprit.spring.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;

@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor //constructeur par defaut
@AllArgsConstructor //constructeur personnalisé
@Builder
@FieldDefaults(level=AccessLevel.PRIVATE)
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long idClient;
    private String nom;
    private String prenom;
    private String email;
    private String telephone;
    private String numPermis;
    private LocalDate dateInscription;
}
