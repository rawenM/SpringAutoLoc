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
public class Reservation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long idReservation;
    private LocalDate dateDebut;
    private LocalDate dateFin;
    private StatutReservation statut;
}
