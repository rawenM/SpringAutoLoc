package tn.esprit.spring.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.math.BigDecimal;
import java.time.LocalDate;
@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor //constructeur par defaut
@AllArgsConstructor //constructeur personnalisé
@Builder
@FieldDefaults(level=AccessLevel.PRIVATE)
public class Contrat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idContrat;
    private LocalDate dateSignature;
    private BigDecimal montantTotal;
    private boolean valide;
}
