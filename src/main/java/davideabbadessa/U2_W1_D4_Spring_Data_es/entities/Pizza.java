package davideabbadessa.U2_W1_D4_Spring_Data_es.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;


@Entity
@NoArgsConstructor
@Getter
@Setter
public class Pizza extends Item{

//    @OneToMany(mappedBy = "pizza")
//    private List<Topping> toppings = new ArrayList<>();

    public Pizza(String nome, double prezzo, int calorie) {
        super(nome, prezzo, calorie);
       // this.toppings = toppings;
    }

    @Override
    public String toString() {
        return "🍕Pizza🍕 --> " + super.toString();
    }
}
