package sia.taco_cloud.data;

import java.util.Optional;
import sia.taco_cloud.Ingredient;

public interface IngredientRepository extends Repository<Ingredient, String> {

        Iterable<Ingredient> findAll();

        Optional<Ingredient> findById(String id);

        Ingredient save(Ingredient ingredient);

}
