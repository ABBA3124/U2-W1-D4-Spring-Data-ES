package davideabbadessa.U2_W1_D4_Spring_Data_es.entities;


import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Drink extends Item{


    public Drink(String nome, double prezzo, int calorie) {
        super(nome, prezzo, calorie);
    }

}
