package davideabbadessa.U2_W1_D4_Spring_Data_es;


import davideabbadessa.U2_W1_D4_Spring_Data_es.entities.Menu;
import davideabbadessa.U2_W1_D4_Spring_Data_es.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class MyRunner implements CommandLineRunner {

    //richiamo Menu component
    @Autowired
    private UsersService menu;


    @Override
    public void run(String... args) throws Exception {

    }
}