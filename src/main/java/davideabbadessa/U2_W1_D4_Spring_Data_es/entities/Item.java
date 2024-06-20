package davideabbadessa.U2_W1_D4_Spring_Data_es.entities;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.UUID;


@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@NoArgsConstructor
@Getter
@ToString
public abstract class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;


    private String nome;
    private double prezzo;
    private int calorie;


    public Item(String nome, double prezzo, int calorie) {
        this.nome = nome;
        this.prezzo = prezzo;
        this.calorie = calorie;
    }
}
