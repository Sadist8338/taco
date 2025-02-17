package sia.taco_cloud.data;

import org.springframework.data.repository.CrudRepository;
import sia.taco_cloud.TacoOrder;
import java.util.List;


public interface OrderRepository extends 
CrudRepository< TacoOrder, Long>{
List<TacoOrder> findByDeliveryZip(String deliveryZip);

}
