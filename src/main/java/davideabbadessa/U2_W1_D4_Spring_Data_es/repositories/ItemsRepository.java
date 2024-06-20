package davideabbadessa.U2_W1_D4_Spring_Data_es.repositories;

import davideabbadessa.U2_W1_D4_Spring_Data_es.entities.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ItemsRepository extends JpaRepository<Item, UUID> {






}
