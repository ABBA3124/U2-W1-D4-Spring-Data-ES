package davideabbadessa.U2_W1_D4_Spring_Data_es;


import davideabbadessa.U2_W1_D4_Spring_Data_es.entities.Drink;
import davideabbadessa.U2_W1_D4_Spring_Data_es.entities.Pizza;
import davideabbadessa.U2_W1_D4_Spring_Data_es.entities.Topping;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeansConfiguration {

    //<------------ Topping ------------>
    @Bean
    public Topping mozzarella() {
        return new Topping("\nMozzarella", 0.50, 92);
    }

    @Bean
    public Topping prosciutto() {
        return new Topping("\nProsciutto", 0.50, 35);
    }

    @Bean
    public Topping cipolle() {
        return new Topping("\nCipolle", 0.50, 22);
    }

    @Bean
    public Topping ananas() {
        return new Topping("\nAnanas", 0.50, 24);
    }

    @Bean
    public Topping salame() {
        return new Topping("\nSalame", 0.50, 86);
    }

    //<------------ Pizze ------------>
    @Bean
    public Pizza margherita() {
        Pizza pizza = new Pizza("\nPizza Margherita (Pomodoro, Mozzarella)", 4.99, 1104);
       // pizza.aggiungiTopping(mozzarella());
        return pizza;
    }

    @Bean
    public Pizza hawaiianPizza() {
        Pizza pizza = new Pizza("\nHawaiian Pizza (Pomodoro, Mozzarella, Prosciutto, Ananas)", 6.49, 1024);
        //pizza.aggiungiTopping(mozzarella());
        //pizza.aggiungiTopping(prosciutto());
        //pizza.aggiungiTopping(ananas());
        return pizza;
    }

    @Bean
    public Pizza salamiPizza() {
        Pizza pizza = new Pizza("\nSalami Pizza (Pomodoro, Mozzarella, Salame)", 5.99, 1160);
        //pizza.aggiungiTopping(mozzarella());
       //pizza.aggiungiTopping(salame());
        return pizza;
    }

    //<------------ Drink ------------>
    @Bean
    public Drink limonata() {
        return new Drink("\nLimonata (0.33l)", 1.29, 128);
    }

    @Bean
    public Drink acqua() {
        return new Drink("\nAcqua (0.5l)", 1.29, 0);
    }

    @Bean
    public Drink vino() {
        return new Drink("\nVino (0.75l, 13%)", 7.49, 607);
    }

}
