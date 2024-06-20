package davideabbadessa.U2_W1_D4_Spring_Data_es.service;


import davideabbadessa.U2_W1_D4_Spring_Data_es.entities.Item;
import davideabbadessa.U2_W1_D4_Spring_Data_es.repositories.ItemsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ItemService {


    @Autowired
    private ItemsRepository itemsRepository;

    public void salvaItem (Item item){
        itemsRepository.save(item);
        System.out.println("\n"+ item + "  "+ " ✔️salvato correttamente!✔️");
    }




}
