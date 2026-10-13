package tn.esprit.spring.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.math.BigDecimal;

@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor //constructeur par defaut
@AllArgsConstructor //constructeur personnalisé
@Builder
@FieldDefaults(level=AccessLevel.PRIVATE)
public class Vehicule {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
private  Long idVehicule;
private String marque;
private String modele;
private String immatriculation;
private CategorieVehicule categorie;
private BigDecimal tarifJournalier;
private StatutVehicule statut;
}
