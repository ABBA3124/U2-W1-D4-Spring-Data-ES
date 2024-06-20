package davideabbadessa.U2_W1_D4_Spring_Data_es;



import com.github.javafaker.Faker;
import davideabbadessa.U2_W1_D4_Spring_Data_es.entities.Drink;
import davideabbadessa.U2_W1_D4_Spring_Data_es.entities.Pizza;
import davideabbadessa.U2_W1_D4_Spring_Data_es.entities.Topping;
import davideabbadessa.U2_W1_D4_Spring_Data_es.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

import java.util.Locale;
import java.util.Random;

@Component
public class MyRunner implements CommandLineRunner {


    @Autowired
    private ItemService itemService;

    @Autowired
    AnnotationConfigApplicationContext context;

    @Override
    public void run(String... args) throws Exception {
        Faker faker = new Faker(Locale.ITALY);
        Random rdmn = new Random();


        boolean ciao = false;

        if(ciao) {
            //<------------ Topping ------------>
            Topping mozzarella = (Topping) context.getBean("mozzarella");
            Topping prosciutto = (Topping) context.getBean("prosciutto");
            Topping cipolle = (Topping) context.getBean("cipolle");
            Topping ananas = (Topping) context.getBean("ananas");
            Topping salame = (Topping) context.getBean("salame");

            itemService.salvaItem(mozzarella);
            itemService.salvaItem(prosciutto);
            itemService.salvaItem(cipolle);
            itemService.salvaItem(ananas);
            itemService.salvaItem(salame);

            //<------------ Pizze ------------>
            Pizza margherita = (Pizza) context.getBean("margherita");
            Pizza hawaiianPizza = (Pizza) context.getBean("hawaiianPizza");
            Pizza salamiPizza = (Pizza) context.getBean("salamiPizza");

            itemService.salvaItem(margherita);
            itemService.salvaItem(hawaiianPizza);
            itemService.salvaItem(salamiPizza);

            //<------------ Drink ------------>
            Drink limonata = (Drink) context.getBean("limonata");
            Drink acqua = (Drink) context.getBean("acqua");
            Drink vino = (Drink) context.getBean("vino");

            itemService.salvaItem(limonata);
            itemService.salvaItem(acqua);
            itemService.salvaItem(vino);
        } else {
            System.out.println("nulla perchè è false");
        }

    }
}